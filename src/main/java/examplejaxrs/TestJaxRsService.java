package examplejaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/items")
public class TestJaxRsService {
    
    @GET
    public Response getItems() {
        String r = "JAX-RS: Hello, world";
        return Response.ok(r).build();
    }
    
    @GET
    @Path("{id}")
    public Response getById(@PathParam("id") String id) {
        String r = "JAX-RS: you requested item with id \"" + id + "\"";
        return Response.ok(r).build();
    }
}
