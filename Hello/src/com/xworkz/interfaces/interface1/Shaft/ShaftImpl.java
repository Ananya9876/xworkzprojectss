package com.xworkz.interfaces.interface1.Shaft;

public class ShaftImpl implements Shaft {
    public void spin() {
        System.out.println("spin called");
    }
    public void hold() {
        System.out.println("hold called");
    }
    public void balance() {
        System.out.println("balance called");
    }
    public static void main(String[] args) {
        Shaft obj = new ShaftImpl();
        obj.spin();
        obj.hold();
        obj.balance();
    }
}
