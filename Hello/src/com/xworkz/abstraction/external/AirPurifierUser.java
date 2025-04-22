package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.AirPurifier;

public class AirPurifierUser {
    private AirPurifier airpurifier;

    public AirPurifierUser(AirPurifier airpurifier) {
        this.airpurifier = airpurifier;
        System.out.println("AirPurifierUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (airpurifier != null) {
            System.out.println("AirPurifier is not null.");
            airpurifier.analyze();
        } else {
            System.out.println("AirPurifier is null.");
            airpurifier.analyze();
        }
    }
}
