package org.designpattern.structural.composite;

import org.designpattern.structural.composite.resource.Drive;
import org.designpattern.structural.composite.resource.File;
import org.designpattern.structural.composite.resource.Folder;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("file1", "txt", "1MB");
        File file2 = new File("file2", "doc", "2MB");

        Folder folder1 = new Folder("folder1");
        folder1.addResource(file1);
        folder1.addResource(file2);

        File file3 = new File("file3", "js", "3MB");
        File file4 = new File("file4", "jsx", "4MB");

        Folder folder2 = new Folder("folder2");
        folder2.addResource(file3);
        folder2.addResource(file4);

        Drive drive = new Drive("drive1", "10GB");
        drive.addResource(folder1);
        drive.addResource(folder2);

        drive.execute();
    }
}
