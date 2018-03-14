# simple-jaxrs-application
Example JAX-RS Application Setup (Jersey/Tomcat 8)

This is a simple maven project that should allow you to use JAX-RS (via Jersey) with Apache Tomcat.  There is an application class called `ExampleApplication` : `javax.ws.rs.core.Application` and one REST service called `TestJaxRsService`.

When running the REST service will be available at `<host>/examplejaxrs/services/items` and return a 'Hello, world' message. 

The application was tested with Apache Tomcat versions 8.0 and 8.5.

