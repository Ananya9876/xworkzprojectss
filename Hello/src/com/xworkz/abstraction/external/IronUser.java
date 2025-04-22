package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Iron;

public class IronUser {
    private Iron iron;

    public IronUser(Iron iron) {
        this.iron = iron;
        System.out.println("IronUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (iron != null) {
            System.out.println("Iron is not null.");
            iron.toast();
        } else {
            System.out.println("Iron is null.");
        }
    }
}
