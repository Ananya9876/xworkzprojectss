package com.xworkz.abstraction.internal;

public class TabletImpl implements Tablet {
    @Override
    public void detect() {
        System.out.println("Detecting smoke in Tablet.");
    }
}
