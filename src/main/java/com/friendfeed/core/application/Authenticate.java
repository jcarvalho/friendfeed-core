package com.friendfeed.core.application;

import pt.ist.fenixframework.Atomic;

import com.friendfeed.core.domain.User;

public class Authenticate {

    public static User login(String screenName, String password) {
        return User.findByUsername(screenName);
    }

    @Atomic
    public static boolean createUser(String name, String screenName, String email, String password) {
        if (User.findByUsername(screenName) != null) {
            return false;
        }
        User user = new User(screenName);
        user.setEmail(email);
        user.setPassword(password);
        return true;
    }

}
