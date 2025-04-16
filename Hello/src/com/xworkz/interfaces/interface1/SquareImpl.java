package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Square;

public class SquareImpl implements Square {
    public void check() {
        System.out.println("check called");
    }
    public void mark() {
        System.out.println("mark called");
    }
    public void align() {
        System.out.println("align called");
    }

}
