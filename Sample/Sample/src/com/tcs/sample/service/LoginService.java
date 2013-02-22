package com.tcs.sample.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

@Path("/secureLogin")
public interface LoginService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/getuser")
	public String getUserData(@Context HttpServletRequest request,
			@Context HttpServletResponse response,
			@QueryParam("userName") String userName,
			@QueryParam("password") String password)
			throws WebApplicationException, Exception;

}
