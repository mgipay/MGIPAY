package com.ac;

import javax.ws.rs.Consumes;

import com.ac1211.client.Test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Consumes("application/xml")
@Produces("application/xml")
public class ACImpl implements ACInterface {
	

	@GET
	@Path("/getFee")
	@Override
	public void getFee(@Context HttpServletRequest request,
			@Context HttpServletResponse response,@QueryParam("amt") int amt) {
		Test test = new Test();
		try {
			test.test(amt);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
