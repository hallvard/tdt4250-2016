package no.hal.pgo.http.auth;

public interface ISubjectProvider<P> {
	public P getSubject();
}
