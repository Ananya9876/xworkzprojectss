package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Microwave;

public class MicrowaveUser {
    private Microwave microwave;

    public MicrowaveUser(Microwave microwave) {
        this.microwave = microwave;
        System.out.println("MicrowaveUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (microwave != null) {
            System.out.println("Microwave is not null.");
            microwave.execute();
        } else {
            System.out.println("Microwave is null.");
        }
    }
}
