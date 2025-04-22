package com.xworkz.abstraction.internal;

public class SecurityCameraImpl implements SecurityCamera {
    @Override
    public void read() {
        System.out.println("Reading the data in SecurityCamera.");
    }
}
