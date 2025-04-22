package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.WashingMachine;

public class WashingMachineUser {
    private WashingMachine washingmachine;

    public WashingMachineUser(WashingMachine washingmachine) {
        this.washingmachine = washingmachine;
        System.out.println("WashingMachineUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (washingmachine != null) {
            System.out.println("WashingMachine is not null.");
            washingmachine.operate();
        } else {
            System.out.println("WashingMachine is null.");
        }
    }
}
