package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Screw;

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

}
