package org.designpattern.structural.facade.sub;

public class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("HardDrive read at " + lba + " with size " + size);
        return new byte[size];
    }
}
