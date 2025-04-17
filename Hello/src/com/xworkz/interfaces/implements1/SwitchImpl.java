package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Switch;

public class SwitchImpl implements Switch {
    public void toggle() {
        System.out.println("toggle called");
    }
    public void enable() {
        System.out.println("enable called");
    }
    public void disable() {
        System.out.println("disable called");
    }
    public void insert() {
        System.out.println("Card inserted into ATM...");
    }
}
