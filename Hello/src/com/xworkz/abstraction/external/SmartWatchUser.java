package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.SmartWatch;

public class SmartWatchUser {
    private SmartWatch smartwatch;

    public SmartWatchUser(SmartWatch smartwatch) {
        this.smartwatch = smartwatch;
        System.out.println("SmartWatchUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (smartwatch != null) {
            System.out.println("SmartWatch is not null.");
            smartwatch.powerUp();
        } else {
            System.out.println("SmartWatch is null.");
        }
    }
}
