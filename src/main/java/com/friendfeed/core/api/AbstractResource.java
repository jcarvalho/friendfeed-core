package com.friendfeed.core.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.Context;

public class AbstractResource {

	@Context
	protected HttpServletRequest request;

	@Context
	protected HttpServletResponse response;

}
