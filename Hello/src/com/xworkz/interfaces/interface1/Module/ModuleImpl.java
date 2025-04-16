package com.xworkz.interfaces.interface1.Module;

public class ModuleImpl implements Module {
    public void integrate() {
        System.out.println("integrate called");
    }
    public void isolate() {
        System.out.println("isolate called");
    }
    public void test() {
        System.out.println("test called");
    }
    public static void main(String[] args) {
        Module obj = new ModuleImpl();
        obj.integrate();
        obj.isolate();
        obj.test();
    }
}
