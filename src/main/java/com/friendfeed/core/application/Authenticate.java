package com.friendfeed.core.application;

import pt.ist.fenixframework.Atomic;

import com.friendfeed.core.domain.User;

public class Authenticate {

    public static User login(String username, String password) {
        User user = User.findByUsername(username);
        if (user == null) {
            user = createUser(username);
        }
        return user;
    }

    @Atomic
    private static User createUser(String username) {
        User user = User.findByUsername(username);
        if (user != null) {
            return user;
        }
        user = new User(username);
        return user;
    }

}
