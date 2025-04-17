package com.xworkz.interfaces.interfaceclass;

public interface Gadget {
    void activate();
    void deactivate();
    void troubleshoot();

    default void reboot() {
        System.out.println("Reboot of the gadget...");
    }

}
