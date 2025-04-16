package com.xworkz.interfaces.interface1.Seal;

public class SealImpl implements Seal {
    public void compress() {
        System.out.println("compress called");
    }
    public void stretch() {
        System.out.println("stretch called");
    }
    public void hold() {
        System.out.println("hold called");
    }
    public static void main(String[] args) {
        Seal obj = new SealImpl();
        obj.compress();
        obj.stretch();
        obj.hold();
    }
}
