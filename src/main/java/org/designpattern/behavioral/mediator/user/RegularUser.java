package org.designpattern.behavioral.mediator.user;

import org.designpattern.behavioral.mediator.chat.Mediator;

public class RegularUser extends User {
    public RegularUser(Mediator mediator, String name) {
        super(name, mediator);
    }

    @Override
    public void sendMessage(String message) {
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println("Regular User " + this.getName() + " received: " + message);
    }
}
