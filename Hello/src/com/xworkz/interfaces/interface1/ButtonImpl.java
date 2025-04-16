package com.xworkz.interfaces.interface1;

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

}
