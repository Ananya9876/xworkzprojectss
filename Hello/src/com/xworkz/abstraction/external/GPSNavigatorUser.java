package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.GPSNavigator;

public class GPSNavigatorUser {
    private GPSNavigator gpsnavigator;

    public GPSNavigatorUser(GPSNavigator gpsnavigator) {
        this.gpsnavigator = gpsnavigator;
        System.out.println("GPSNavigatorUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (gpsnavigator != null) {
            System.out.println("GPSNavigator is not null.");
            gpsnavigator.hover();
        } else {
            System.out.println("GPSNavigator is null.");
        }
    }
}
