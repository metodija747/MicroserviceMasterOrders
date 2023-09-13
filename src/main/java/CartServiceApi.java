import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/cart")
@RegisterRestClient
public interface CartServiceApi {

    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    Response deleteCart();
}
