package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Keyboard;

public class KeyboardUser {
    private Keyboard keyboard;

    public KeyboardUser(Keyboard keyboard) {
        this.keyboard = keyboard;
        System.out.println("KeyboardUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (keyboard != null) {
            System.out.println("Keyboard is not null.");
            keyboard.clean();
        } else {
            System.out.println("Keyboard is null.");
        }
    }
}
