package com.xworkz.interfaces.implements1;

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
    public void price() {
        System.out.println("Price is 4500...");
    }


}
