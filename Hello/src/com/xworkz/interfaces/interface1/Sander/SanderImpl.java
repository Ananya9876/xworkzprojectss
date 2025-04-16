package com.xworkz.interfaces.interface1.Sander;

public class SanderImpl implements Sander {
    public void smooth() {
        System.out.println("smooth called");
    }
    public void finish() {
        System.out.println("finish called");
    }
    public void clean() {
        System.out.println("clean called");
    }
    public static void main(String[] args) {
        Sander obj = new SanderImpl();
        obj.smooth();
        obj.finish();
        obj.clean();
    }
}
