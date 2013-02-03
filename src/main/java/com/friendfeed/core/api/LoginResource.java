package com.friendfeed.core.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.auth.RequestToken;

@Path("/login")
public class LoginResource extends AbstractResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getLogin() throws TwitterException {

	Twitter twitter = TwitterFactory.getSingleton();

	RequestToken token = twitter.getOAuthRequestToken("http://localhost:8080/friendfeed/api/logged");

	return token.getAuthenticationURL();

    }

}
