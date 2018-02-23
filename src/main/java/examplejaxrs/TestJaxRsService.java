package examplejaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/items")
public class TestJaxRsService {
    
    @GET
    public String getItems() {
        return "JAX-RS: Hello, world";
    }
}
