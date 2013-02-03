package com.friendfeed.core.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.friendfeed.core.domain.FriendFeed;

@Path("/login")
public class LoginResource extends AbstractResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getLogin() {
	return "hello " + FriendFeed.getInstance();
    }

}
