package com.xworkz.interfaces.interface3;

import com.xworkz.interfaces.interfaceclass.*;

import java.lang.System;

public class Tripod implements Connector, Controller, Cover, Device, Pump {


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
    public void place() {
        System.out.println("place called");
    }
    public void remove() {
        System.out.println("remove called");
    }
    public void protect() {
        System.out.println("protect called");
    }
    public void powerUp() {
        System.out.println("powerUp called");
    }
    public void powerDown() {
        System.out.println("powerDown called");
    }
    public void suction() {
        System.out.println("suction called");
    }
    public void pressure() {
        System.out.println("pressure called");
    }
    public void stop() {
        System.out.println("stop called");
    }


}
