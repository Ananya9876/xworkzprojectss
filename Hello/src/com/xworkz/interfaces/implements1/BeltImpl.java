package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Belt;

public class BeltImpl implements Belt {
    public void tension() {
        System.out.println("tension called");
    }
    public void move() {
        System.out.println("move called");
    }
    public void slip() {
        System.out.println("slip called");
    }

    public void color() {
        System.out.println("color is usually brown and black.");
    }
}
