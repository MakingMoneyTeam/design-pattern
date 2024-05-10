package org.designpattern.behavioral.command;

import org.designpattern.behavioral.command.commands.CloseFileCommand;
import org.designpattern.behavioral.command.commands.Command;
import org.designpattern.behavioral.command.commands.OpenFileCommand;
import org.designpattern.behavioral.command.commands.WriteFileCommand;

public class Main {
    public static void main(String[] args) {
        FileSystemReceiver fs = new FileSystemReceiver();

        Command openFileCommand = new OpenFileCommand(fs);
        Command writeFileCommand = new WriteFileCommand(fs);
        Command closeFileCommand = new CloseFileCommand(fs);

        FileInvoker file = new FileInvoker(openFileCommand);
        file.execute(); // Opening file

        file.setCommand(writeFileCommand);
        file.execute(); // Writing to file

        file.setCommand(closeFileCommand);
        file.execute(); // Closing file
    }
}
