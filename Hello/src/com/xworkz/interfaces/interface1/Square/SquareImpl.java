package com.xworkz.interfaces.interface1.Square;

public class SquareImpl implements Square {
    public void check() {
        System.out.println("check called");
    }
    public void mark() {
        System.out.println("mark called");
    }
    public void align() {
        System.out.println("align called");
    }
    public static void main(String[] args) {
        Square obj = new SquareImpl();
        obj.check();
        obj.mark();
        obj.align();
    }
}
