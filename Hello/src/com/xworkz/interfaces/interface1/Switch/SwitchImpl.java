package com.xworkz.interfaces.interface1.Switch;

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
    public static void main(String[] args) {
        Switch obj = new SwitchImpl();
        obj.toggle();
        obj.enable();
        obj.disable();
    }
}
