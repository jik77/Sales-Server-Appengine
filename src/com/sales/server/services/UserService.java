package com.sales.server.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.sales.server.models.User;

@Path("/user")
public class UserService {

	@POST
	@Consumes("application/json")
	@Produces("application/xml")
	@Path("/add-user")
	public Response addUserDetails(User model) {
		if (model.firstName.equals(null) || model.lastName.equals(null) || model.email.equals(null)
				|| model.password.equals(null))
			return Response.status(Status.BAD_REQUEST).build();

		return Response.status(Status.ACCEPTED.getStatusCode()).entity(model).build();
	}

	// @GET
	// @Produces("application/xml")
	// @Path("/get-users")
	// public String getUserDetails(@PathParam("id") int id) {
	//
	// }

}
