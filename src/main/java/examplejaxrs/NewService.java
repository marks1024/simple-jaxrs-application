package examplejaxrs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/widgets")
public class NewService {
    
    @GET
    public Response getWidgets() {
        return Response.ok("Jax-Rs: Widgets").build();
    }
}
