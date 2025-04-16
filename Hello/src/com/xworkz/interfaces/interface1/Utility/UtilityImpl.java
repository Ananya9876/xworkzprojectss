package com.xworkz.interfaces.interface1.Utility;

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
    public static void main(String[] args) {
        Utility obj = new UtilityImpl();
        obj.run();
        obj.monitor();
        obj.terminate();
    }
}
