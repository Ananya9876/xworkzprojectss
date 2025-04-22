package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Smartphone;

public class SmartphoneUser {
    private Smartphone smartphone;

    public SmartphoneUser(Smartphone smartphone) {
        this.smartphone = smartphone;
        System.out.println("SmartphoneUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (smartphone != null) {
            System.out.println("Smartphone is not null.");
            smartphone.display();
        } else {
            System.out.println("Smartphone is null.");
        }
    }
}
