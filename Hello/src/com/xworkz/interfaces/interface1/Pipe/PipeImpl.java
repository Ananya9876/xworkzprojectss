package com.xworkz.interfaces.interface1.Pipe;

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
    public static void main(String[] args) {
        Pipe obj = new PipeImpl();
        obj.carry();
        obj.leakCheck();
        obj.insulate();
    }
}
