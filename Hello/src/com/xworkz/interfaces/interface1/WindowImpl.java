package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Window;

public class WindowImpl implements Window {
    public void open() {
        System.out.println("open called");
    }
    public void close() {
        System.out.println("close called");
    }
    public void lock() {
        System.out.println("lock called");
    }

}
