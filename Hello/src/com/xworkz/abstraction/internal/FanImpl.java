package com.xworkz.abstraction.internal;

public class FanImpl implements Fan {
    @Override
    public void record() {
        System.out.println("Recording the video in Fan.");
    }
}
