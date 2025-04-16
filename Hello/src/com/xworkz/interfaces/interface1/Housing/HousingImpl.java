package com.xworkz.interfaces.interface1.Housing;

public class HousingImpl implements Housing {
    public void surround() {
        System.out.println("surround called");
    }
    public void protect() {
        System.out.println("protect called");
    }
    public void vent() {
        System.out.println("vent called");
    }
    public static void main(String[] args) {
        Housing obj = new HousingImpl();
        obj.surround();
        obj.protect();
        obj.vent();
    }
}
