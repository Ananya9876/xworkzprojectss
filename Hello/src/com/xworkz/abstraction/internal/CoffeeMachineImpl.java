package com.xworkz.abstraction.internal;

public class CoffeeMachineImpl implements CoffeeMachine {
    @Override
    public void charge() {
        System.out.println("Charging the battery in CoffeeMachine.");
    }
}
