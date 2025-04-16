package com.xworkz.interfaces.interface1.Nut;

public class NutImpl implements Nut {
    public void twist() {
        System.out.println("twist called");
    }
    public void grip() {
        System.out.println("grip called");
    }
    public void hold() {
        System.out.println("hold called");
    }
    public static void main(String[] args) {
        Nut obj = new NutImpl();
        obj.twist();
        obj.grip();
        obj.hold();
    }
}
