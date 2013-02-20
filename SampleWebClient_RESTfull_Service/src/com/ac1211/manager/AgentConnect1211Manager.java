/**
 * 
 */
package com.ac1211.manager;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

/**
 * @author TCS
 * 
 */

@Path("/service")
public interface AgentConnect1211Manager {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/feeLookup")
	com.ac1211.client.FeeLookupResponse feeLookup(
			@Context HttpServletRequest request,
			@Context HttpServletResponse response,
			@QueryParam("amount") String amount) throws Exception;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/sendReversal")
	String sendReversal(@Context HttpServletRequest request,
			@Context HttpServletResponse response) throws Exception;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/sendValidation")
	String sendValidation(@Context HttpServletRequest request,
			@Context HttpServletResponse response) throws Exception;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/codeTable")
	List<String> codeTable(@Context HttpServletRequest request,
			@Context HttpServletResponse response) throws Exception;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/commitTransaction")
	String commitTransaction(@Context HttpServletRequest request,
			@Context HttpServletResponse response) throws Exception;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/detailLookup")
	String detailLookup(@Context HttpServletRequest request,
			@Context HttpServletResponse response) throws Exception;

}
