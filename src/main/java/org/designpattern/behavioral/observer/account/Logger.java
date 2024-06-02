package org.designpattern.behavioral.observer.account;

public class Logger implements Observer {
    @Override
    public void update(User user) {
        System.out.println("Logger: User(email=" + user.getEmail() +
                ", ip=" + user.getIp() + ", status=" + user.getStatus() + ")");
    }
}
