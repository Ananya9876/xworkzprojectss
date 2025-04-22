package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.SmartBulb;

public class SmartBulbUser {
    private SmartBulb smartbulb;

    public SmartBulbUser(SmartBulb smartbulb) {
        this.smartbulb = smartbulb;
        System.out.println("SmartBulbUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (smartbulb != null) {
            System.out.println("SmartBulb is not null.");
            smartbulb.expand();
        } else {
            System.out.println("SmartBulb is null.");
        }
    }
}
