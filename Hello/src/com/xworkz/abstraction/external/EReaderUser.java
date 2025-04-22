package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.EReader;

public class EReaderUser {
    private EReader ereader;

    public EReaderUser(EReader ereader) {
        this.ereader = ereader;
        System.out.println("EReaderUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (ereader != null) {
            System.out.println("EReader is not null.");
            ereader.capture();
        } else {
            System.out.println("EReader is null.");
        }
    }
}
