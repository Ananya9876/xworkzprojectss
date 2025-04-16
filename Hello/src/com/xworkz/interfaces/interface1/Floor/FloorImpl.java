package com.xworkz.interfaces.interface1.Floor;

public class FloorImpl implements Floor {
    public void lay() {
        System.out.println("lay called");
    }
    public void tile() {
        System.out.println("tile called");
    }
    public void polish() {
        System.out.println("polish called");
    }
    public static void main(String[] args) {
        Floor obj = new FloorImpl();
        obj.lay();
        obj.tile();
        obj.polish();
    }
}
