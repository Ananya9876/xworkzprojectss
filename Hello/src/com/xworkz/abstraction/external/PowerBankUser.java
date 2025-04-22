package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.PowerBank;

public class PowerBankUser {
    private PowerBank powerbank;

    public PowerBankUser(PowerBank powerbank) {
        this.powerbank = powerbank;
        System.out.println("PowerBankUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (powerbank != null) {
            System.out.println("PowerBank is not null.");
            powerbank.schedule();
        } else {
            System.out.println("PowerBank is null.");
        }
    }
}
