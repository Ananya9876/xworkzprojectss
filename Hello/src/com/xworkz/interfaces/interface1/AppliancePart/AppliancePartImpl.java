package com.xworkz.interfaces.interface1.AppliancePart;

public class AppliancePartImpl implements AppliancePart {
    public void insert() {
        System.out.println("insert called");
    }
    public void eject() {
        System.out.println("eject called");
    }
    public void inspect() {
        System.out.println("inspect called");
    }
    public static void main(String[] args) {
        AppliancePart obj = new AppliancePartImpl();
        obj.insert();
        obj.eject();
        obj.inspect();
    }
}
