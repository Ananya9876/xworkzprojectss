package com.xworkz.interfaces.interface1.Gadget;

public class GadgetImpl implements Gadget {
    public void activate() {
        System.out.println("activate called");
    }
    public void deactivate() {
        System.out.println("deactivate called");
    }
    public void troubleshoot() {
        System.out.println("troubleshoot called");
    }
    public static void main(String[] args) {
        Gadget obj = new GadgetImpl();
        obj.activate();
        obj.deactivate();
        obj.troubleshoot();
    }
}
