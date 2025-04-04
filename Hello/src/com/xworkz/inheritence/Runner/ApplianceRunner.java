package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.apparatus.Apparatus;
import com.xworkz.inheritence.internal.apparatus.WashingMachine;

public class ApplianceRunner {
    public static void main(String[] args) {
        Apparatus apparatus = new WashingMachine();
        apparatus.powerOn();
        apparatus.powerOff();
        apparatus.consumeElectricity();
        apparatus.function();
        apparatus.brand();

        System.out.println("**************************************");

        WashingMachine washingMachine = new WashingMachine();
        washingMachine.powerOn();
        washingMachine.powerOff();
        washingMachine.consumeElectricity();
        washingMachine.function();
        washingMachine.brand();

        System.out.println("**************************************");
    }
}
