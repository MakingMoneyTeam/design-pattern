package org.designpattern.structural.bridge;

import org.designpattern.structural.bridge.devices.Device;
import org.designpattern.structural.bridge.devices.Radio;
import org.designpattern.structural.bridge.devices.Television;
import org.designpattern.structural.bridge.remotes.AdvancedRemote;
import org.designpattern.structural.bridge.remotes.BasicRemote;

public class Main {
    public static void main(String[] args) {
        testDevice(new Television());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
