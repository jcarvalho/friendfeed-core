package com.friendfeed.core.application;

import pt.ist.fenixframework.Atomic;

import com.friendfeed.core.domain.User;
import com.friendfeed.core.domain.login.PasswordLogin;

public class Authenticate {

    public static User login(String screenName, String password) {
        return User.findByScreenName(screenName);
    }

    @Atomic
    public static boolean createUser(String name, String screenName, String email, String password) {
        if (User.findByScreenName(screenName) != null) {
            return false;
        }
        User user = new User(name, screenName, email);
        user.addLogin(new PasswordLogin(password));
        return true;
    }

}
