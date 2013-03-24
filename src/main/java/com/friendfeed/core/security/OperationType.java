package com.friendfeed.core.security;

import com.friendfeed.core.domain.User;

public interface OperationType {

    /**
     * Returns an assessment regarding whether the specified {@link User} is allowed to execute this operation.
     * 
     * @param user
     *            The {@link User} attempting to run the operation.
     *            May be {@code null} if no user is logged in.
     * 
     * @return Whether the specified {@link User} is authorized to
     *         execute this operation.
     * 
     */
    public boolean isUserAuthorized(final User user);

}
