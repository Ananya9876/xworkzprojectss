package com.xworkz.interfaces.interface2;

import com.xworkz.interfaces.interfaceclass.Battery;
import com.xworkz.interfaces.interfaceclass.Belt;

public class Projector implements Battery, Belt {
    public void tension() {
        System.out.println("tension called");
    }
    public void move() {
        System.out.println("move called");
    }
    public void slip() {
        System.out.println("slip called");
    }
    public void charge() {
        System.out.println("charge called");
    }
    public void discharge() {
        System.out.println("discharge called");
    }
    public void recycle() {
        System.out.println("recycle called");
    }

}
