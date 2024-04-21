package org.designpattern.behavioral.state;

import org.designpattern.behavioral.state.vending_machine.VendingMachineContext;
import org.designpattern.behavioral.state.vending_machine.states.OutOfStockState;
import org.designpattern.behavioral.state.vending_machine.states.PaymentPendingState;
import org.designpattern.behavioral.state.vending_machine.states.ProductSelectedState;
import org.designpattern.behavioral.state.vending_machine.states.ReadyState;

public class Main {
    public static void main(String[] args) {
        // Create context
        VendingMachineContext vendingMachine = new VendingMachineContext();

        // Set initial state
        vendingMachine.setState(new ReadyState());

        // Request state change
        vendingMachine.request();

        // Change state
        vendingMachine.setState(new ProductSelectedState());

        // Request state change
        vendingMachine.request();

        // Change state
        vendingMachine.setState(new PaymentPendingState());

        // Request state change
        vendingMachine.request();

        // Change state
        vendingMachine.setState(new OutOfStockState());

        // Request state change
        vendingMachine.request();
    }
}
