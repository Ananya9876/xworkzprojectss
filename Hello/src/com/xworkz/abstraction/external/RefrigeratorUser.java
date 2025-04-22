package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Refrigerator;

public class RefrigeratorUser {
    private Refrigerator refrigerator;

    public RefrigeratorUser(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
        System.out.println("RefrigeratorUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (refrigerator != null) {
            System.out.println("Refrigerator is not null.");
            refrigerator.stop();
        } else {
            System.out.println("Refrigerator is null.");
        }
    }
}
