package com.xworkz.interfaces.interface1.Blade;

public class BladeImpl implements Blade {
    public void cut() {
        System.out.println("cut called");
    }
    public void sharpen() {
        System.out.println("sharpen called");
    }
    public void store() {
        System.out.println("store called");
    }
    public static void main(String[] args) {
        Blade obj = new BladeImpl();
        obj.cut();
        obj.sharpen();
        obj.store();
    }
}
