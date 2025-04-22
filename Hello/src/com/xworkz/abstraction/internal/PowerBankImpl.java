package com.xworkz.abstraction.internal;

public class PowerBankImpl implements PowerBank {
    @Override
    public void schedule() {
        System.out.println("Scheduling the task in PowerBank.");
    }
}
