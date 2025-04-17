package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Hose;

public class HoseImpl implements Hose {
    public void connect() {
        System.out.println("connect called");
    }
    public void flow() {
        System.out.println("flow called");
    }
    public void disconnect() {
        System.out.println("disconnect called");
    }
    public void ring() {
        System.out.println("Alarm is ringing...");
    }
}
