package no.hal.pgo.http;

import java.io.Writer;

public interface IResponseSerializer {

	public void serialize(Object object, Writer writer) throws Exception;
}
