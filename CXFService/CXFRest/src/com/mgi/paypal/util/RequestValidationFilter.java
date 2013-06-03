package com.mgi.paypal.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

public class RequestValidationFilter implements Filter {

	private static final Logger LOGGER = Logger
			.getLogger(RequestValidationFilter.class);

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(
			ServletRequest servletRequest, ServletResponse servletResponse,
			FilterChain filterChain) throws IOException, ServletException {

		LOGGER.debug("Entered doFilter Servlet Filter");

		HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
		HttpSession httpSession = httpServletRequest.getSession();
		LOGGER.debug("URI : " + httpServletRequest.getRequestURI());

		LOGGER.debug("session id :  " + httpSession.getId());

		if (httpServletRequest.getRequestURI().contains("getFee")
				|| httpServletRequest.getRequestURI().contains("getUserLimits")
				|| httpServletRequest.getRequestURI()
						.contains("sendValidation")
				|| httpServletRequest.getRequestURI().contains(
						"sendTransactionInformationMail")
				|| httpServletRequest.getRequestURI().contains(
						"commitTransaction")
				|| httpServletRequest.getRequestURI().contains(
						"getHistoryDetails")) {
			String userLoggedIn = (String) httpSession.getAttribute("userLoggedIn");
			
			LOGGER.debug("session id :  " + httpSession.getId()
					+ " and userLoggedIn-" + userLoggedIn);
			if (userLoggedIn == null || !userLoggedIn.equalsIgnoreCase("true")) {
				return;
			} else {
				filterChain.doFilter(servletRequest, servletResponse);
			}
		} else {
			filterChain.doFilter(servletRequest, servletResponse);
		}
		LOGGER.debug("Exit doFilter Servlet Filter");
	}

		

//		filterChain.doFilter(servletRequest, servletResponse);
//		LOGGER.debug("Exit doFilter Servlet Filter");

//	}

	@Override
	public void init(
			FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

}
