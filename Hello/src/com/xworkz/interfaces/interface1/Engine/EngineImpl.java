package com.xworkz.interfaces.interface1.Engine;

public class EngineImpl implements Engine {
    public void ignite() {
        System.out.println("ignite called");
    }
    public void throttle() {
        System.out.println("throttle called");
    }
    public void idle() {
        System.out.println("idle called");
    }
    public static void main(String[] args) {
        Engine obj = new EngineImpl();
        obj.ignite();
        obj.throttle();
        obj.idle();
    }
}
