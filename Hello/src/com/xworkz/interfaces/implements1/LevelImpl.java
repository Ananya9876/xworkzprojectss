package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Level;

public class LevelImpl implements Level {
    public void measure() {
        System.out.println("measure called");
    }
    public void align() {
        System.out.println("align called");
    }
    public void indicate() {
        System.out.println("indicate called");
    }

    public void place() {
        System.out.println("Level is placed...");
    }
}
