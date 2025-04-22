package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.ElectricKettle;

public class ElectricKettleUser {
    private ElectricKettle electrickettle;

    public ElectricKettleUser(ElectricKettle electrickettle) {
        this.electrickettle = electrickettle;
        System.out.println("ElectricKettleUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (electrickettle != null) {
            System.out.println("ElectricKettle is not null.");
            electrickettle.sync();
        } else {
            System.out.println("ElectricKettle is null.");
        }
    }
}
