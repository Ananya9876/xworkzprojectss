package com.xworkz.interfaces.interface1.Accessory;

public class AccessoryImpl implements Accessory {
    public void attach() {
        System.out.println("attach called");
    }
    public void detach() {
        System.out.println("detach called");
    }
    public void clean() {
        System.out.println("clean called");
    }
    public static void main(String[] args) {
        Accessory obj = new AccessoryImpl();
        obj.attach();
        obj.detach();
        obj.clean();
    }
}
