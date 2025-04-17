package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Display;

public class DisplayImpl implements Display {
    public void show() {
        System.out.println("show called");
    }
    public void refresh() {
        System.out.println("refresh called");
    }
    public void clear() {
        System.out.println("clear called");
    }

    public void remove() {
        System.out.println("Display is removed...");
    }
}
