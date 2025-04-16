package com.xworkz.interfaces.interface2;

import com.xworkz.interfaces.interfaceclass.Furniture;
import com.xworkz.interfaces.interfaceclass.Gadget;

public class Bicycle implements Furniture, Gadget {
    public void assemble() {
        System.out.println("assemble called");
    }
    public void disassemble() {
        System.out.println("disassemble called");
    }
    public void polish() {
        System.out.println("polish called");
    }
    public void activate() {
        System.out.println("activate called");
    }
    public void deactivate() {
        System.out.println("deactivate called");
    }
    public void troubleshoot() {
        System.out.println("troubleshoot called");
    }

}
