package com.xworkz.interfaces.interface1.Charger;

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
    public static void main(String[] args) {
        Charger obj = new ChargerImpl();
        obj.connect();
        obj.power();
        obj.disconnect();
    }
}
