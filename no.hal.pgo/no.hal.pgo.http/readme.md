# no.hal.pgo.http
generic code for providing HTTP access to EMF data, so you can serve model instances to web clients.

## Overview

This project includes a __HttpServlet__ that serves EMF data provided by a __IResourceProvider__ using REST-like navigation in the object graph and serializes the result in the Json format. This process is performed in four steps:
1. The initial set of objects is retrieved from the __IResourceProvider__.
2. The request path is translated to a set of segments, each of which is a navigation step that maps from the current objects to another set of objects (used by the next step).
3. The URL query part is the final navigation or mapping step.
4. Finally, the resulting set of objects is serialized, i.e. written to the HttpResponse output stream.

The __IResourceProvider__ may provide implementions of the interfaces __IRequestPartResolver__, __IRequestQueryExecutor__ and __IResponseSerializer__ corresponding to the steps 2, 3 and 4. Hence, it has full control of how its data is served. If it doesn't provide one or more, default implementations are used.

In addition to the servlet, there is an OSGi service, __IResourceEndPointProvider__, that uses an HttpService to register end-points for the __IResourceProvider__ objects that is added to it. Thus, by implementing a __ResourceProvider__ and adding it to the registered OSGi __IResourceEndPointProvider__ service implementation, you can serve any EMF data!

### The interfaces and implementations

__IResourceProvider__ provides the data to serve, as well as implementations of the interfaces performing the steps 2, 3 and 4 above. THe data is any collection og objects, but typically the root objects of an EMF Resource. The standard implementation is __ResourceProvider__, which returns the root objects in an EMF __Resource__, optionally filtered by an __EClass__.

__IRequestPathResolver__ maps from the initial root objects to a final set of objects by applying a sequence of navigations _steps_, which are the segments in the request path. The default implementation is __DefaultRequestPathResolver__, which supports five kinds of steps:
1. extract the _named_ _feature_ (__EStructuralFeature__) of the objects
2. invoke a _named_ no-args _operation_ (__EOperation__) on the objects
3. select an element in the set by _number_
4. filter the set of objects by the _named_ _class_ (EClass)
5. resolve the _name_ using an __IReferenceResolver__, e.g. get a named object

__IRequestQueryExecutor__ maps from a set of objects to another set of objects by executing the query consisting of a name (the final segment) and a set of named parameters (the query). The default implementation is __DefaultRequestQueryExecutor__, which supports the same five steps as above, except that the operation can use query paramters.
