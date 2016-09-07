# EMF support for OSM data

## Introduction

Open Street Map (OSM) is a great source of geographic data, including general geographic data, points of interest and meta-data about such. OSM supports exporting all the data it has for a certain region (within a bounding box) as XML. To make it easier to consume this data, we have created an Ecore model with XML-specific annotations that allows us to read in OSM data and process using EMF APIs and tools.

## The OSM model

The OSM model was primarily created for loading the XML, and secondarily for integration in other models. E.g. a **Node** contains attributes for latitude, longitude pair, since the XML has such attributes. However, these attributes have been moved to a **GeoLocation** superclass, to make it easier for other models to include such data, too. Similarly, we have added a **LatLong** data class and corresponding **EDataType** and a **GeoLocated** interface for returning such an object. This allows returning a latitude, longitude pair without revealing how it is stored, and makes other code less dependent on representation details.

### EClassifiers

* **LatLong** - Java data value class and EDataType with latitude, longitude pair, and a method for distance computation. Implements **equals**, **hashCode**, **toString** and **valueOf**, the latter two support the standard Ecore Factory implementation.
* **GeoLocated** and **GeoLocation** - interface for latitude, longitude pair and implementation
* **Tagged**, **Tags** and **Tag** - interface for tags, container for tags implementing the interface and key, value pair
* **Node** - a point in OSM, with location, tags and meta-data 
* **Way** and **NodeRef** - a sequence of nodes, as **NodeRef** objects, e.g. for paths
* **Relation** and **Member** - composite representing more semantic geographical objects. Contains **Member** objects that relates any **OSMElement** to a type and role (Strings)
* **OSM** and **OSMElement** - root container class and abstract superclass for **Node**, **Way** and **Relation**
* **Bounds**, **Note**, **MetaData** - metadata about XML export

## Implementation

The implementation consists mainly of generated code and custom method bodies. Most noteworthy is how the **GeoLocated**. The resource implementation has been extended to speed up loading of large files.
