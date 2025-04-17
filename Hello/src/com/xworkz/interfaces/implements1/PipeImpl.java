package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Pipe;

public class PipeImpl implements Pipe {
    public void carry() {
        System.out.println("carry called");
    }
    public void leakCheck() {
        System.out.println("leakCheck called");
    }
    public void insulate() {
        System.out.println("insulate called");
    }
    public void repair() {
        System.out.println("Repairing...");
    }
    }

