package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Washer;

public class WasherImpl implements Washer {
    public void cushion() {
        System.out.println("cushion called");
    }
    public void space() {
        System.out.println("space called");
    }
    public void seal() {
        System.out.println("seal called");
    }

}
