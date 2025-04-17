package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Button;

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

    public void shell() {
        System.out.println("Working with shell.");
    }
}
