package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Shaft;

public class ShaftImpl implements Shaft {
    public void spin() {
        System.out.println("spin called");
    }
    public void hold() {
        System.out.println("hold called");
    }
    public void balance() {
        System.out.println("balance called");
    }

}
