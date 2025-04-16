package com.xworkz.interfaces.interface1.Key;

public class KeyImpl implements Key {
    public void insert() {
        System.out.println("insert called");
    }
    public void turn() {
        System.out.println("turn called");
    }
    public void remove() {
        System.out.println("remove called");
    }
    public static void main(String[] args) {
        Key obj = new KeyImpl();
        obj.insert();
        obj.turn();
        obj.remove();
    }
}
