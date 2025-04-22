package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.HairDryer;

public class HairDryerUser {
    private HairDryer hairdryer;

    public HairDryerUser(HairDryer hairdryer) {
        this.hairdryer = hairdryer;
        System.out.println("HairDryerUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (hairdryer != null) {
            System.out.println("HairDryer is not null.");
            hairdryer.blend();
        } else {
            System.out.println("HairDryer is null.");
        }
    }
}
