package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Juicer;

public class JuicerUser {
    private Juicer juicer;

    public JuicerUser(Juicer juicer) {
        this.juicer = juicer;
        System.out.println("JuicerUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (juicer != null) {
            System.out.println("Juicer is not null.");
            juicer.download();
        } else {
            System.out.println("Juicer is null.");
        }
    }
}
