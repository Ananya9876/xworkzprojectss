package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Television;

public class TelevisionUser {
    private Television television;

    public TelevisionUser(Television television) {
        this.television = television;
        System.out.println("TelevisionUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (television != null) {
            System.out.println("Television is not null.");
            television.start();
        } else {
            System.out.println("Television is null.");
        }
    }
}
