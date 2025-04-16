package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Filter;

public class FilterImpl implements Filter {
    public void trap() {
        System.out.println("trap called");
    }
    public void clean() {
        System.out.println("clean called");
    }
    public void replace() {
        System.out.println("replace called");
    }

}
