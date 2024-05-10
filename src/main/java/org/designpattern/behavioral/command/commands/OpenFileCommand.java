package org.designpattern.behavioral.command.commands;

import org.designpattern.behavioral.command.FileSystemReceiver;

public class OpenFileCommand implements Command {
    private FileSystemReceiver fileSystemReceiver;

    public OpenFileCommand(FileSystemReceiver fileSystemReceiver) {
        this.fileSystemReceiver = fileSystemReceiver;
    }

    @Override
    public void execute() {
        fileSystemReceiver.openFile();
    }
}
