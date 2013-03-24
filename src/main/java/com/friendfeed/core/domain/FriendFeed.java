package com.friendfeed.core.domain;

import pt.ist.fenixframework.Atomic;
import pt.ist.fenixframework.FenixFramework;

public class FriendFeed extends FriendFeed_Base {

    private FriendFeed() {
        super();
    }

    public static FriendFeed getInstance() {
        FriendFeed instance = FenixFramework.getDomainRoot().getFriendFeed();
        if (instance == null) {
            instance = initialize();
        }
        return instance;
    }

    @Atomic
    private static FriendFeed initialize() {
        FriendFeed instance = FenixFramework.getDomainRoot().getFriendFeed();
        if (instance == null) {
            FenixFramework.getDomainRoot().setFriendFeed(new FriendFeed());
        }
        return FenixFramework.getDomainRoot().getFriendFeed();
    }
}
