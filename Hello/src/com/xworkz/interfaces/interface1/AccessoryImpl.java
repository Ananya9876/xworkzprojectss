package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Accessory;

public class AccessoryImpl implements Accessory {
    public void attach() {
        System.out.println("attach called");
    }
    public void detach() {
        System.out.println("detach called");
    }
    public void clean() {
        System.out.println("clean called");
    }

}
