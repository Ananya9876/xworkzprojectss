package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Flashlight;

public class FlashlightUser {
    private Flashlight flashlight;

    public FlashlightUser(Flashlight flashlight) {
        this.flashlight = flashlight;
        System.out.println("FlashlightUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (flashlight != null) {
            System.out.println("Flashlight is not null.");
            flashlight.lock();
        } else {
            System.out.println("Flashlight is null.");
        }
    }
}
