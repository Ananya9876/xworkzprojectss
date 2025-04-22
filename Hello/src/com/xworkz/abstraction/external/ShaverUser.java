package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Shaver;

public class ShaverUser {
    private Shaver shaver;

    public ShaverUser(Shaver shaver) {
        this.shaver = shaver;
        System.out.println("ShaverUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (shaver != null) {
            System.out.println("Shaver is not null.");
            shaver.control();
        } else {
            System.out.println("Shaver is null.");
        }
    }
}
