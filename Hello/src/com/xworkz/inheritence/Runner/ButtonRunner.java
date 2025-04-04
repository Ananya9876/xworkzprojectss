package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.button.ElectricButton;
import com.xworkz.inheritence.internal.button.Button;

public class ButtonRunner {
    public static void main(String[] args) {
        Button sw = new ElectricButton();
        sw.turnOn();
        sw.turnOff();
        sw.saveElectricity();
        sw.availableInVariousDesigns();
        sw.usedInHomes();

        System.out.println("-----------------");
        ElectricButton electricSwitch = new ElectricButton();
        electricSwitch.turnOn();
        electricSwitch.turnOff();
        electricSwitch.saveElectricity();
        electricSwitch.availableInVariousDesigns();
        electricSwitch.usedInHomes();
    }
}
