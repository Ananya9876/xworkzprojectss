package com.xworkz.interfaces.interface2;

import com.xworkz.interfaces.interfaceclass.Handle;
import com.xworkz.interfaces.interfaceclass.Hinge;

public class Fuse implements Handle, Hinge {
    public void pivot() {
        System.out.println("pivot called");
    }
    public void align() {
        System.out.println("align called");
    }
    public void rust() {
        System.out.println("rust called");
    }
    public void grip() {
        System.out.println("grip called");
    }
    public void twist() {
        System.out.println("twist called");
    }
    public void pull() {
        System.out.println("pull called");
    }


}
