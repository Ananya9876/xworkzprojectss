package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Motor;

public class MotorImpl implements Motor {
    public void run() {
        System.out.println("run called");
    }
    public void speedUp() {
        System.out.println("speedUp called");
    }
    public void slowDown() {
        System.out.println("slowDown called");
    }

}
