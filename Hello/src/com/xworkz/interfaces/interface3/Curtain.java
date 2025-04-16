package com.xworkz.interfaces.interface3;

import com.xworkz.interfaces.interfaceclass.*;

import java.lang.System;

public class Curtain implements Instrument, Knob, Level, Lever, Lock {
    public void play() {
        System.out.println("play called");
    }
    public void tune() {
        System.out.println("tune called");
    }
    public void clean() {
        System.out.println("clean called");
    }
    public void rotate() {
        System.out.println("rotate called");
    }
    public void adjust() {
        System.out.println("adjust called");
    }
    public void calibrate() {
        System.out.println("calibrate called");
    }
    public void measure() {
        System.out.println("measure called");
    }
    public void align() {
        System.out.println("align called");
    }
    public void indicate() {
        System.out.println("indicate called");
    }
    public void pull() {
        System.out.println("pull called");
    }
    public void push() {
        System.out.println("push called");
    }
    public void lock() {
        System.out.println("lock called");
    }
    public void secure() {
        System.out.println("secure called");
    }
    public void open() {
        System.out.println("open called");
    }
    public void jam() {
        System.out.println("jam called");
    }
}
