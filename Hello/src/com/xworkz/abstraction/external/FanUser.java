package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Fan;

public class FanUser {
    private Fan fan;

    public FanUser(Fan fan) {
        this.fan = fan;
        System.out.println("FanUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (fan != null) {
            System.out.println("Fan is not null.");
            fan.record();
        } else {
            System.out.println("Fan is null.");
        }
    }
}
