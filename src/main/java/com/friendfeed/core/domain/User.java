package com.friendfeed.core.domain;

public class User extends User_Base {

    public User(String username) {
        super();
        this.setFriendFeed(FriendFeed.getInstance());
        this.setUsername(username);
    }

    public static User findByUsername(String username) {
        for (User user : FriendFeed.getInstance().getUsers()) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

}
