package com.xworkz.interfaces.interface1.Bolt;

public class BoltImpl implements Bolt {
    public void secure() {
        System.out.println("secure called");
    }
    public void unscrew() {
        System.out.println("unscrew called");
    }
    public void fasten() {
        System.out.println("fasten called");
    }
    public static void main(String[] args) {
        Bolt obj = new BoltImpl();
        obj.secure();
        obj.unscrew();
        obj.fasten();
    }
}
