package org.lorislab.mcp.client.gen.api;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import org.lorislab.mcp.client.gen.api.model.User;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/user")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2019-01-27T18:15:16.772568+01:00[Europe/Berlin]")
@RegisterRestClient
public interface UserApi {

    @GET
    @Produces({ "application/json" })
    List<User> getAll1();

    @GET
    @Path("/{id}")
    @Produces({ "application/json" })
    User getById1(@PathParam("id") Long id);

    @GET
    @Path("/map")
    @Produces({ "application/json" })
    Map<String, User> getMapUsers1();

    @POST
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    User saveUser1(@PathParam("id") Long id,@Valid User user);
}
