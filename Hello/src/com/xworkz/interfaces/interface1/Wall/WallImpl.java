package com.xworkz.interfaces.interface1.Wall;

public class WallImpl implements Wall {
    public void erect() {
        System.out.println("erect called");
    }
    public void paint() {
        System.out.println("paint called");
    }
    public void insulate() {
        System.out.println("insulate called");
    }
    public static void main(String[] args) {
        Wall obj = new WallImpl();
        obj.erect();
        obj.paint();
        obj.insulate();
    }
}
