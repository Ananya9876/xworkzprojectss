package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Appliance;

public class ApplianceUser {
    private Appliance appliance;

    public ApplianceUser(Appliance appliance) {
        this.appliance = appliance;
        System.out.println("ApplianceUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (appliance != null) {
            System.out.println("Appliance is not null.");
            appliance.run();
        } else {
            System.out.println("Appliance is null.");
        }
        appliance.run();
    }
}
