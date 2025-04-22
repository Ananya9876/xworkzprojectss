package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Tablet;

public class TabletUser {
    private Tablet tablet;

    public TabletUser(Tablet tablet) {
        this.tablet = tablet;
        System.out.println("TabletUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (tablet != null) {
            System.out.println("Tablet is not null.");
            tablet.detect();
        } else {
            System.out.println("Tablet is null.");
        }
    }
}
