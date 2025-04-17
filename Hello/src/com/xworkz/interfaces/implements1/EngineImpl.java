package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Engine;

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

    public void engineon() {
        System.out.println("Engine is on...");
    }
}
