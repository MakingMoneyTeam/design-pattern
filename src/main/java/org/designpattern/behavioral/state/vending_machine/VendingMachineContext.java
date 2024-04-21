package org.designpattern.behavioral.state.vending_machine;

import org.designpattern.behavioral.state.vending_machine.states.VendingMachineState;

public class VendingMachineContext {
    private VendingMachineState state;

    public void setState(VendingMachineState state) {
        this.state = state;
    }

    public void request() {
        state.handleRequest();
    }
}
