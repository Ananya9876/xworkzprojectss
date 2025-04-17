package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Gadget;

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
    public void reboot() {
        System.out.println("Reboot of the gadget...");
    }
}
