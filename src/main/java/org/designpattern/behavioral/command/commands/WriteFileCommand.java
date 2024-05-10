package org.designpattern.behavioral.command.commands;

import org.designpattern.behavioral.command.FileSystemReceiver;

public class WriteFileCommand implements Command {
    private FileSystemReceiver fileSystemReceiver;

    public WriteFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        fileSystemReceiver.writeFile();
    }
}
