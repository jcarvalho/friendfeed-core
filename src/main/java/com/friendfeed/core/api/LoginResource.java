package com.friendfeed.core.api;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.RequestToken;

@Path("/login")
public class LoginResource extends AbstractResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Void getLogin(@Context HttpServletResponse respons)
			throws TwitterException, IOException {

		Twitter twitter = TwitterFactory.getSingleton();

		RequestToken token = twitter
				.getOAuthRequestToken("http://localhost:8080/api/logged");

		request.getSession().setAttribute("requestToken", token);

		response.sendRedirect(token.getAuthenticationURL());

		return null;

	}

}
