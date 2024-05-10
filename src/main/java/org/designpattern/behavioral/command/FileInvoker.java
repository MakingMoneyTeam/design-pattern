package org.designpattern.behavioral.command;

import org.designpattern.behavioral.command.commands.Command;

public class FileInvoker {
    private Command command;

    public FileInvoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();
    }
}
