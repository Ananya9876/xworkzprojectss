package com.xworkz.interfaces.interface1.Screw;

public class ScrewImpl implements Screw {
    public void thread() {
        System.out.println("thread called");
    }
    public void tighten() {
        System.out.println("tighten called");
    }
    public void loosen() {
        System.out.println("loosen called");
    }
    public static void main(String[] args) {
        Screw obj = new ScrewImpl();
        obj.thread();
        obj.tighten();
        obj.loosen();
    }
}
