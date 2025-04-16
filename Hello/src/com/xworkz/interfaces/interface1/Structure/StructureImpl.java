package com.xworkz.interfaces.interface1.Structure;

public class StructureImpl implements Structure {
    public void build() {
        System.out.println("build called");
    }
    public void strengthen() {
        System.out.println("strengthen called");
    }
    public void maintain() {
        System.out.println("maintain called");
    }
    public static void main(String[] args) {
        Structure obj = new StructureImpl();
        obj.build();
        obj.strengthen();
        obj.maintain();
    }
}
