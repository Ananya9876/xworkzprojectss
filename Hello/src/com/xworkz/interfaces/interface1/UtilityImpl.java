package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Utility;

public class UtilityImpl implements Utility {
    public void run() {
        System.out.println("run called");
    }
    public void monitor() {
        System.out.println("monitor called");
    }
    public void terminate() {
        System.out.println("terminate called");
    }

}
