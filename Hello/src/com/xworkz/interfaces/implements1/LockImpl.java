package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Lock;

public class LockImpl implements Lock {
    public void secure() {
        System.out.println("secure called");
    }
    public void open() {
        System.out.println("open called");
    }
    public void jam() {
        System.out.println("jam called");
    }

    public void key() {
        System.out.println("Key is used for lock...");
    }
}
