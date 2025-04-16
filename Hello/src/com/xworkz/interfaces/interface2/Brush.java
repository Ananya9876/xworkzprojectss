package com.xworkz.interfaces.interface2;

import com.xworkz.interfaces.interfaceclass.Display;
import com.xworkz.interfaces.interfaceclass.Door;

public class Brush implements Display, Door {
    public void swing() {
        System.out.println("swing called");
    }
    public void latch() {
        System.out.println("latch called");
    }
    public void unlock() {
        System.out.println("unlock called");
    }
    public void show() {
        System.out.println("show called");
    }
    public void refresh() {
        System.out.println("refresh called");
    }
    public void clear() {
        System.out.println("clear called");
    }


}
