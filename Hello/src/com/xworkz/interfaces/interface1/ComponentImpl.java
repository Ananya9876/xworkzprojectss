package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Component;

public class ComponentImpl implements Component {
    public void fit() {
        System.out.println("fit called");
    }
    public void remove() {
        System.out.println("remove called");
    }
    public void test() {
        System.out.println("test called");
    }


}
