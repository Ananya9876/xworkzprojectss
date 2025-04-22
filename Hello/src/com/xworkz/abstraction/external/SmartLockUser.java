package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.SmartLock;

public class SmartLockUser {
    private SmartLock smartlock;

    public SmartLockUser(SmartLock smartlock) {
        this.smartlock = smartlock;
        System.out.println("SmartLockUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (smartlock != null) {
            System.out.println("SmartLock is not null.");
            smartlock.compress();
        } else {
            System.out.println("SmartLock is null.");
        }
    }
}
