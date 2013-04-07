package com.friendfeed.core.security;

import com.friendfeed.core.domain.User;

public class Authorizations {

    public static class Public implements Authorization {
        @Override
        public boolean isUserAuthorized(User user) {
            return true;
        }
    }

    public static class LoggedIn implements Authorization {
        @Override
        public boolean isUserAuthorized(User user) {
            return user != null;
        }
    }

    public static class Admin implements Authorization {
        @Override
        public boolean isUserAuthorized(User user) {
            return user != null;
        }
    }

}
