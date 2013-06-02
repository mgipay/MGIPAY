package com.mgi.paypal.util;

import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;


@Provider
@Produces("application/JSON")
public class CXFExceptionMapper implements ExceptionMapper<Exception> {

	@Override
	public Response toResponse(
			Exception exception) {
		return Response
				.status(Status.BAD_REQUEST)
				.entity("An error has occurred while processing. Please try again. " +
						"If you continue to receive this error, contact MoneyGram at 1-800-MONEYGRAM. Thank you.")
				.build();
	}

}