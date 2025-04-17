package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Spring;

public class SpringImpl implements Spring {
    public void compress() {
        System.out.println("compress called");
    }
    public void release() {
        System.out.println("release called");
    }
    public void bounce() {
        System.out.println("bounce called");
    }
    public void ring() {
        System.out.println("Alarm is ringing...");
    }
}
