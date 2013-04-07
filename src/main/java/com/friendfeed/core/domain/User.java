package com.friendfeed.core.domain;

public class User extends User_Base {

    public User(String name, String screenName, String email) {
        super();
        this.setFriendFeed(FriendFeed.getInstance());
        this.setName(name);
        this.setScreenName(screenName);
        this.setEmail(email);
    }

    public static User findByScreenName(String screenName) {
        for (User user : FriendFeed.getInstance().getUsers()) {
            if (user.getScreenName().equals(screenName)) {
                return user;
            }
        }
        return null;
    }

}
