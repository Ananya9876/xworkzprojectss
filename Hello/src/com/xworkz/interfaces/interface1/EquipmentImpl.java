package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Equipment;

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

}
