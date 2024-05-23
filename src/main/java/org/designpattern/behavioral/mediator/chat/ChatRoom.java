package org.designpattern.behavioral.mediator.chat;

import org.designpattern.behavioral.mediator.user.User;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements Mediator {
    private final List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User sender) {
        for (User user : users) {
            if (user != sender) {
                user.receiveMessage(sender.getName() + ": " + message);
            }
        }
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }
}
