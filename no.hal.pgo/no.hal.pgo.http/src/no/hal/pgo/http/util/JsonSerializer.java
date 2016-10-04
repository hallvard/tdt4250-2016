package no.hal.pgo.http.util;

import java.io.IOException;
import java.io.Writer;
import java.util.Stack;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.service.component.annotations.Component;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import no.hal.pgo.http.IResponseSerializer;

@SuppressWarnings("serial")
@Component
public class JsonSerializer extends StdSerializer<EObject> implements IResponseSerializer {
	
	private ObjectMapper objectMapper;
	
	public JsonSerializer() {
		super(EObject.class);
		SimpleModule module = new SimpleModule();
		module.addSerializer(EObject.class, this);
		this.objectMapper = new ObjectMapper();
		objectMapper.registerModule(module);
	}

	private Stack<EObject> occurStack;

	@Override
	public void serialize(Object object, Writer writer) throws Exception {
		try {
			this.occurStack = new Stack<EObject>();
			ObjectWriter objectWriter = objectMapper.writer(new DefaultPrettyPrinter());
			objectWriter.writeValue(writer, object);
		} finally {
			this.occurStack = null;
		}
	}

	public static final String JSON_SERIALIZER_ANNOTATION_SOURCE = JsonSerializer.class.getName();

	@Override
	public void serialize(EObject eObject, JsonGenerator generator, SerializerProvider serializerProvider) throws IOException, JsonGenerationException {
		int count = 0;
		for (int i = occurStack.size() - 1; i >= 0; i--) {
			if (occurStack.get(i) == eObject) {
				count++;
				if (count >= 2) {
					generator.writeString("...");
					return;
				}
			}
		}
		if (occurStack.size() > 0 && eObject.eResource() != null) {
			for (int i = occurStack.size() - 1; i >= 0; i--) {
				String ref = null;
				try {
					ref = "???";
				} catch (Exception e) {
				}
				if (ref != null) {
					generator.writeString(ref);
					return;
				}
			}
			generator.writeString("???");
			return;
		}
		occurStack.push(eObject);
		generator.writeStartObject();
		try {
			for (EStructuralFeature feature : eObject.eClass().getEAllStructuralFeatures()) {
				boolean isContainment = true;
				if (feature instanceof EReference) {
					isContainment = ((EReference) feature).isContainment();
				}
				if (isContainment ? (! AnnotationUtil.excludeElement(feature, JSON_SERIALIZER_ANNOTATION_SOURCE)) : AnnotationUtil.includeElement(feature, JSON_SERIALIZER_ANNOTATION_SOURCE)) {
					String name = getFieldName(feature);
					generator.writeFieldName(name);
					Object value = eObject.eGet(feature);
					generator.writeObject(value);
				}
			}
		} catch (RuntimeException e) {
		} finally {
			generator.writeEndObject();
			occurStack.pop();
		}
	}

	protected String getFieldName(EStructuralFeature feature) {
		String altName = EcoreUtil.getAnnotation(feature, JSON_SERIALIZER_ANNOTATION_SOURCE, "name");
		return altName != null ? altName : feature.getName();
	}
}
