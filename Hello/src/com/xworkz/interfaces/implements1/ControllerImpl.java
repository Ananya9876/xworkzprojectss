package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Controller;

public class ControllerImpl implements Controller {
    public void program() {
        System.out.println("program called");
    }
    public void execute() {
        System.out.println("execute called");
    }
    public void reset() {
        System.out.println("reset called");
    }

    public void debug() {
        System.out.println("Bebug the program...");
    }
}
