package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Furniture;

public class FurnitureImpl implements Furniture {
    public void assemble() {
        System.out.println("assemble called");
    }
    public void disassemble() {
        System.out.println("disassemble called");
    }
    public void polish() {
        System.out.println("polish called");
    }

}
