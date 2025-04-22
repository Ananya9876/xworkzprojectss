package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.CoffeeMachine;

public class CoffeeMachineUser {
    private CoffeeMachine coffeemachine;

    public CoffeeMachineUser(CoffeeMachine coffeemachine) {
        this.coffeemachine = coffeemachine;
        System.out.println("CoffeeMachineUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (coffeemachine != null) {
            System.out.println("CoffeeMachine is not null.");
            coffeemachine.charge();
        } else {
            System.out.println("CoffeeMachine is null.");
        }
    }
}
