package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Nut;

public class NutImpl implements Nut {
    public void twist() {
        System.out.println("twist called");
    }
    public void grip() {
        System.out.println("grip called");
    }
    public void hold() {
        System.out.println("hold called");
    }
    public void squize() {
        System.out.println("Nut is twiisted...");
    }
}
