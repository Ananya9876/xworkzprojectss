package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Charger;

public class ChargerImpl implements Charger {
    public void connect() {
        System.out.println("connect called");
    }
    public void power() {
        System.out.println("power called");
    }
    public void disconnect() {
        System.out.println("disconnect called");
    }

    public void poweron() {
        System.out.println("Charging of the phone");
    }
}
