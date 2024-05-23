package org.designpattern.behavioral.mediator.user;

import org.designpattern.behavioral.mediator.chat.Mediator;

public abstract class User {
    protected String name;
    protected Mediator mediator;

    public User(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);

    public String getName() {
        return name;
    }
}
