package com.friendfeed.core.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;

@Path("/logged")
public class LoggedResource extends AbstractResource {

	@GET
	public String acceptLogin(@QueryParam("oauth_token") String oauthToken,
			@QueryParam("oauth_verifier") String oauthVerifier)
			throws TwitterException {
		System.out.println(oauthToken + " : " + oauthVerifier);

		Twitter twitter = TwitterFactory.getSingleton();

		RequestToken token = (RequestToken) request.getSession().getAttribute(
				"requestToken");

		AccessToken accessToken = twitter.getOAuthAccessToken(token,
				oauthVerifier);

		return accessToken.toString();
	}

}
