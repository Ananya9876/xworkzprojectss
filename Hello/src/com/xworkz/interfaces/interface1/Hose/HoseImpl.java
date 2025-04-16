package com.xworkz.interfaces.interface1.Hose;

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
    public static void main(String[] args) {
        Hose obj = new HoseImpl();
        obj.connect();
        obj.flow();
        obj.disconnect();
    }
}
