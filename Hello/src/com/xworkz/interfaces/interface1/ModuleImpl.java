package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Module;

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

}
