package com.xworkz.interfaces.interfaceclass;

public interface Furniture {
    void assemble();
    void disassemble();
    void polish();

    default void price() {
        System.out.println("Price is 4500...");
    }

}
