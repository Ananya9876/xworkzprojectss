package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Mouse;

public class MouseUser {
    private Mouse mouse;

    public MouseUser(Mouse mouse) {
        this.mouse = mouse;
        System.out.println("MouseUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (mouse != null) {
            System.out.println("Mouse is not null.");
            mouse.project();
        } else {
            System.out.println("Mouse is null.");
        }
    }
}
