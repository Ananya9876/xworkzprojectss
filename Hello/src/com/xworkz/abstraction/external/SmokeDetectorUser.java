package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.SmokeDetector;

public class SmokeDetectorUser {
    private SmokeDetector smokedetector;

    public SmokeDetectorUser(SmokeDetector smokedetector) {
        this.smokedetector = smokedetector;
        System.out.println("SmokeDetectorUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (smokedetector != null) {
            System.out.println("SmokeDetector is not null.");
            smokedetector.lightUp();
        } else {
            System.out.println("SmokeDetector is null.");
        }
    }
}
