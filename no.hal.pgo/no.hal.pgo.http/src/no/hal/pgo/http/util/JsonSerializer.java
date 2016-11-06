package no.hal.pgo.http.util;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Stack;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

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

	private Collection<JsonSerializerHelper> jsonSerializerHelpers = null;
	
	@Reference(cardinality=ReferenceCardinality.MULTIPLE, policy=ReferencePolicy.DYNAMIC, unbind="removeJsonSerializerHelper")
	public void addJsonSerializerHelper(JsonSerializerHelper helper) {
		if (jsonSerializerHelpers == null) {
			jsonSerializerHelpers = new ArrayList<JsonSerializerHelper>();
		}
		jsonSerializerHelpers.add(helper);
	}

	public void removeJsonSerializerHelper(JsonSerializerHelper helper) {
		if (jsonSerializerHelpers != null) {
			jsonSerializerHelpers.remove(helper);
		}
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

	protected JsonSerializerHelper getJsonSerializerHelper(EObject eObject) {
		if (jsonSerializerHelpers != null) {
			for (JsonSerializerHelper helper : jsonSerializerHelpers) {
				if (helper.accept(eObject)) {
					return helper;
				}
			}
		}
		return null;
	}
	
	public static final String JSON_SERIALIZER_ANNOTATION_SOURCE = JsonSerializer.class.getName();

	@Override
	public void serialize(EObject eObject, JsonGenerator generator, SerializerProvider serializerProvider) throws IOException, JsonGenerationException {
//		int count = 0;
//		for (int i = occurStack.size() - 1; i >= 0; i--) {
//			if (occurStack.get(i) == eObject) {
//				count++;
//				if (count >= 2) {
//					generator.writeString("...");
//					return;
//				}
//			}
//		}
		for (int i = occurStack.size() - 1; i >= 0; i--) {
			if (occurStack.get(i) == eObject) {
				generator.writeString("???");
				return;
			}
		}
		occurStack.push(eObject);
		try {
			JsonSerializerHelper helper = getJsonSerializerHelper(eObject);
			if (helper != null) {
				helper.serialize(eObject, generator);
			} else {
				try {
					generator.writeStartObject();
					for (EStructuralFeature feature : eObject.eClass().getEAllStructuralFeatures()) {
						boolean include = true;
						if (feature instanceof EReference) {
							if (((EReference) feature).isContainer()) {
								include = false;
							} else {
								include = AnnotationUtil.includeTypedElement(feature, JSON_SERIALIZER_ANNOTATION_SOURCE);
							}
						}
						if (include) {
							String name = getFieldName(feature);
							Object value = eObject.eGet(feature);
							if (value != null) {
								generator.writeFieldName(name);
								generator.writeObject(value);
							}
						}
					}
				} finally {
					generator.writeEndObject();
				}
			}
		} finally {
//			System.err.println("Exception while serializing " + eObject + ":" + e);
			occurStack.pop();
		}
	}

	protected String getFieldName(EStructuralFeature feature) {
		String altName = EcoreUtil.getAnnotation(feature, JSON_SERIALIZER_ANNOTATION_SOURCE, "name");
		return altName != null ? altName : feature.getName();
	}
}
