package com.xworkz.interfaces.interface1.Level;

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
    public static void main(String[] args) {
        Level obj = new LevelImpl();
        obj.measure();
        obj.align();
        obj.indicate();
    }
}
