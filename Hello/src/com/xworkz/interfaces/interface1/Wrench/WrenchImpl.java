package com.xworkz.interfaces.interface1.Wrench;

public class WrenchImpl implements Wrench {
    public void twist() {
        System.out.println("twist called");
    }
    public void turn() {
        System.out.println("turn called");
    }
    public void hold() {
        System.out.println("hold called");
    }
    public static void main(String[] args) {
        Wrench obj = new WrenchImpl();
        obj.twist();
        obj.turn();
        obj.hold();
    }
}
