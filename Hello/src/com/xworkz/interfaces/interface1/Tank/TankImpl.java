package com.xworkz.interfaces.interface1.Tank;

public class TankImpl implements Tank {
    public void fill() {
        System.out.println("fill called");
    }
    public void drain() {
        System.out.println("drain called");
    }
    public void seal() {
        System.out.println("seal called");
    }
    public static void main(String[] args) {
        Tank obj = new TankImpl();
        obj.fill();
        obj.drain();
        obj.seal();
    }
}
