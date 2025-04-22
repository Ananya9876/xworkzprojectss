package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.AirConditioner;

public class AirConditionerUser {
    private AirConditioner airconditioner;

    public AirConditionerUser(AirConditioner airconditioner) {
        this.airconditioner = airconditioner;
        System.out.println("AirConditionerUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (airconditioner != null) {
            System.out.println("AirConditioner is not null.");
            airconditioner.print();
        } else {
            System.out.println("AirConditioner is null.");
        }
    }
}
