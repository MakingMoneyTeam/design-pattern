package org.designpattern.behavioral.mediator;

import org.designpattern.behavioral.mediator.chat.ChatRoom;
import org.designpattern.behavioral.mediator.chat.Mediator;
import org.designpattern.behavioral.mediator.user.Admin;
import org.designpattern.behavioral.mediator.user.RegularUser;
import org.designpattern.behavioral.mediator.user.User;

public class Main {
    public static void main(String[] args) {
        Mediator chatRoom = new ChatRoom();

        User admin = new Admin(chatRoom, "Admin");
        User user1 = new RegularUser(chatRoom, "User1");
        User user2 = new RegularUser(chatRoom, "User2");

        chatRoom.addUser(admin);
        chatRoom.addUser(user1);
        chatRoom.addUser(user2);

        admin.sendMessage("Hello everyone!");
        user1.sendMessage("Hi Admin!");
        user2.sendMessage("Hi User1!");
    }
}
