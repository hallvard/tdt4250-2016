package no.hal.pgo.http.util;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;

import com.fasterxml.jackson.core.JsonGenerator;

public interface JsonSerializerHelper {
	public boolean accept(EObject eObject);
	public void serialize(EObject eObject, JsonGenerator generator) throws IOException;
}
