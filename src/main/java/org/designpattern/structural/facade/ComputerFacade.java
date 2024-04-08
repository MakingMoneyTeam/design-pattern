package org.designpattern.structural.facade;

import org.designpattern.structural.facade.sub.CPU;
import org.designpattern.structural.facade.sub.HardDrive;
import org.designpattern.structural.facade.sub.Memory;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new HardDrive();
    }

    public void start() {
        cpu.freeze();
        memory.load(0L, hardDrive.read(0L, 1024));
        cpu.jump(0L);
        cpu.execute();
    }
}
