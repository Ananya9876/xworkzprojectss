package com.xworkz.interfaces.interface1.Equipment;

public class EquipmentImpl implements Equipment {
    public void install() {
        System.out.println("install called");
    }
    public void uninstall() {
        System.out.println("uninstall called");
    }
    public void update() {
        System.out.println("update called");
    }
    public static void main(String[] args) {
        Equipment obj = new EquipmentImpl();
        obj.install();
        obj.uninstall();
        obj.update();
    }
}
