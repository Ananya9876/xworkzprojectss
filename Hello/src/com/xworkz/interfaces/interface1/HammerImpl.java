package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Hammer;

public class HammerImpl implements Hammer {
    public void hit() {
        System.out.println("hit called");
    }
    public void pull() {
        System.out.println("pull called");
    }
    public void tap() {
        System.out.println("tap called");
    }


}
