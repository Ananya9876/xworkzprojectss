package com.xworkz.interfaces.interface1.Button;

public class ButtonImpl implements Button {
    public void press() {
        System.out.println("press called");
    }
    public void release() {
        System.out.println("release called");
    }
    public void reset() {
        System.out.println("reset called");
    }
    public static void main(String[] args) {
        Button obj = new ButtonImpl();
        obj.press();
        obj.release();
        obj.reset();
    }
}
