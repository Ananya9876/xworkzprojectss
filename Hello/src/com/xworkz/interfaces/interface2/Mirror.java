package com.xworkz.interfaces.interface2;

import com.xworkz.interfaces.interfaceclass.Filter;
import com.xworkz.interfaces.interfaceclass.Floor;

public class Mirror implements Filter, Floor {
    public void lay() {
        System.out.println("lay called");
    }
    public void tile() {
        System.out.println("tile called");
    }
    public void polish() {
        System.out.println("polish called");
    }
    public void trap() {
        System.out.println("trap called");
    }
    public void clean() {
        System.out.println("clean called");
    }
    public void replace() {
        System.out.println("replace called");
    }

}
