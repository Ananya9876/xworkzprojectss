package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Chassis;

public class ChassisImpl implements Chassis {
    public void mount() {
        System.out.println("mount called");
    }
    public void hold() {
        System.out.println("hold called");
    }
    public void align() {
        System.out.println("align called");
    }

}
