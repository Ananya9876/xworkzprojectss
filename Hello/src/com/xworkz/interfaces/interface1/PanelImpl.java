package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Panel;

public class PanelImpl implements Panel {
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

