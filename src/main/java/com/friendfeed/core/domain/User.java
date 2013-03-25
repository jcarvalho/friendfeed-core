package com.friendfeed.core.domain;

public class User extends User_Base {

    public User() {
        super();
        setFriendFeed(FriendFeed.getInstance());
    }

}
