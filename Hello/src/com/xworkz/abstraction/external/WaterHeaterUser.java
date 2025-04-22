package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.WaterHeater;

public class WaterHeaterUser {
    private WaterHeater waterheater;

    public WaterHeaterUser(WaterHeater waterheater) {
        this.waterheater = waterheater;
        System.out.println("WaterHeaterUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (waterheater != null) {
            System.out.println("WaterHeater is not null.");
            waterheater.scan();
        } else {
            System.out.println("WaterHeater is null.");
        }
    }
}
