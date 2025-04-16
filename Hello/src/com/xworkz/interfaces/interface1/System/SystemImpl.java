package com.xworkz.interfaces.interface1.System;

public class SystemImpl implements System {
    public void boot() {
        java.lang.System.out.println("boot called");
    }
    public void runDiagnostics() {
        java.lang.System.out.println("runDiagnostics called");
    }
    public void shutDown() {
        java.lang.System.out.println("shutDown called");
    }
    public static void main(String[] args) {
        System obj = new SystemImpl();
        obj.boot();
        obj.runDiagnostics();
        obj.shutDown();
    }
}
