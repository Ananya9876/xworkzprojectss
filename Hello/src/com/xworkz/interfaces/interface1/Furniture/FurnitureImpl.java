package com.xworkz.interfaces.interface1.Furniture;

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
    public static void main(String[] args) {
        Furniture obj = new FurnitureImpl();
        obj.assemble();
        obj.disassemble();
        obj.polish();
    }
}
