package com.xworkz.interfaces.implements1;

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

    public void work() {
        System.out.println("To make holes on the wall...");
    }
}
