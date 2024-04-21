package org.designpattern.behavioral.state.vending_machine.states;

public class PaymentPendingState implements VendingMachineState {
    @Override
    public void handleRequest() {
        System.out.println("Payment pending state: Dispensing product.");
    }
}
