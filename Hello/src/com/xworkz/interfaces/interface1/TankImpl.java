package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Tank;

public class TankImpl implements Tank {
    public void fill() {
        System.out.println("fill called");
    }
    public void drain() {
        System.out.println("drain called");
    }
    public void seal() {
        System.out.println("seal called");
    }

}
