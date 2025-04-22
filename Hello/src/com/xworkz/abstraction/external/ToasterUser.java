package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Toaster;

public class ToasterUser {
    private Toaster toaster;

    public ToasterUser(Toaster toaster) {
        this.toaster = toaster;
        System.out.println("ToasterUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (toaster != null) {
            System.out.println("Toaster is not null.");
            toaster.calculate();
        } else {
            System.out.println("Toaster is null.");
        }
    }
}
