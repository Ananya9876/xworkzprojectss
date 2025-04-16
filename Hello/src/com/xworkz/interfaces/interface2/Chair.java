package com.xworkz.interfaces.interface2;

import com.xworkz.interfaces.interfaceclass.Connector;
import com.xworkz.interfaces.interfaceclass.Controller;

public class Chair implements Connector, Controller {
    public void program() {
        System.out.println("program called");
    }
    public void execute() {
        System.out.println("execute called");
    }
    public void reset() {
        System.out.println("reset called");
    }
    public void link() {
        System.out.println("link called");
    }
    public void secure() {
        System.out.println("secure called");
    }
    public void release() {
        System.out.println("release called");
    }

}
