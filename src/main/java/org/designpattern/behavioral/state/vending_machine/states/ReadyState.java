package org.designpattern.behavioral.state.vending_machine.states;

public class ReadyState implements VendingMachineState {
    @Override
    public void handleRequest() {
        System.out.println("Ready state: Please select a product.");
    }
}
