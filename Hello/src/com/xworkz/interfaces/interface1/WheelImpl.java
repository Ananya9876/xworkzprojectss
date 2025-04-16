package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Wheel;

public class WheelImpl implements Wheel {
    public void spin() {
        System.out.println("spin called");
    }
    public void stop() {
        System.out.println("stop called");
    }
    public void align() {
        System.out.println("align called");
    }

}
