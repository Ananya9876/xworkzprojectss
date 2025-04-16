package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Drill;

public class DrillImpl implements Drill {
    public void bore() {
        System.out.println("bore called");
    }
    public void reverse() {
        System.out.println("reverse called");
    }
    public void stop() {
        System.out.println("stop called");
    }

}
