package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Floor;

public class FloorImpl implements Floor {
    public void lay() {
        System.out.println("lay called");
    }
    public void tile() {
        System.out.println("tile called");
    }
    public void polish() {
        System.out.println("polish called");
    }

}
