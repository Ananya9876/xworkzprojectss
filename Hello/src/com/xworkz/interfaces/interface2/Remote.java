package com.xworkz.interfaces.interface2;

import com.xworkz.interfaces.interfaceclass.Foundation;
import com.xworkz.interfaces.interfaceclass.Frame;

public class Remote implements Foundation, Frame {
    public void set() {
        System.out.println("set called");
    }
    public void level() {
        System.out.println("level called");
    }
    public void cure() {
        System.out.println("cure called");
    }
    public void support() {
        System.out.println("support called");
    }
    public void secure() {
        System.out.println("secure called");
    }
    public void stabilize() {
        System.out.println("stabilize called");
    }

}
