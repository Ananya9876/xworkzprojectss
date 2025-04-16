package com.xworkz.interfaces.interface1.Plane;

public class PlaneImpl implements Plane {
    public void shave() {
        System.out.println("shave called");
    }
    public void level() {
        System.out.println("level called");
    }
    public void finish() {
        System.out.println("finish called");
    }
    public static void main(String[] args) {
        Plane obj = new PlaneImpl();
        obj.shave();
        obj.level();
        obj.finish();
    }
}
