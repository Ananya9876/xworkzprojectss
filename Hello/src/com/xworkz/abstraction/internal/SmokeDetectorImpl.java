package com.xworkz.abstraction.internal;

public class SmokeDetectorImpl implements SmokeDetector {
    @Override
    public void lightUp() {
        System.out.println("Lighting up the room in SmokeDetector.");
    }
}
