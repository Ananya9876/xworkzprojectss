package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Lever;

public class LeverImpl implements Lever {
    public void pull() {
        System.out.println("pull called");
    }
    public void push() {
        System.out.println("push called");
    }
    public void lock() {
        System.out.println("lock called");
    }

    public void unlock() {
        System.out.println("Unlock...");
    }
}
