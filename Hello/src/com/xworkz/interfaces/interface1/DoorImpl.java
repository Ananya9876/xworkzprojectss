package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Door;

public class DoorImpl implements Door {
    public void swing() {
        System.out.println("swing called");
    }
    public void latch() {
        System.out.println("latch called");
    }
    public void unlock() {
        System.out.println("unlock called");
    }

}
