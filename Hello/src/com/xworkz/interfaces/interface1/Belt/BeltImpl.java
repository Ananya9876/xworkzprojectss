package com.xworkz.interfaces.interface1.Belt;

public class BeltImpl implements Belt {
    public void tension() {
        System.out.println("tension called");
    }
    public void move() {
        System.out.println("move called");
    }
    public void slip() {
        System.out.println("slip called");
    }
    public static void main(String[] args) {
        Belt obj = new BeltImpl();
        obj.tension();
        obj.move();
        obj.slip();
    }
}
