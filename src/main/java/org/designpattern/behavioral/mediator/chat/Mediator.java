package org.designpattern.behavioral.mediator.chat;

import org.designpattern.behavioral.mediator.user.User;

public interface Mediator {
    void sendMessage(String message, User sender);
    void addUser(User user);
}
