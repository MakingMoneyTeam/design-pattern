package org.designpattern.behavioral.command;

public class FileSystemReceiver {
    public void openFile() {
        System.out.println("Opening file...");
    }

    public void writeFile() {
        System.out.println("Writing file...");
    }

    public void closeFile() {
        System.out.println("Closing file...");
    }
}
