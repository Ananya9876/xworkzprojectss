package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Humidifier;

public class HumidifierUser {
    private Humidifier humidifier;

    public HumidifierUser(Humidifier humidifier) {
        this.humidifier = humidifier;
        System.out.println("HumidifierUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (humidifier != null) {
            System.out.println("Humidifier is not null.");
            humidifier.flash();
        } else {
            System.out.println("Humidifier is null.");
        }
    }
}
