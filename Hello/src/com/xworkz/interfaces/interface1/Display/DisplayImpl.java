package com.xworkz.interfaces.interface1.Display;

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
    public static void main(String[] args) {
        Display obj = new DisplayImpl();
        obj.show();
        obj.refresh();
        obj.clear();
    }
}
