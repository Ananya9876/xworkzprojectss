package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Thermostat;

public class ThermostatUser {
    private Thermostat thermostat;

    public ThermostatUser(Thermostat thermostat) {
        this.thermostat = thermostat;
        System.out.println("ThermostatUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (thermostat != null) {
            System.out.println("Thermostat is not null.");
            thermostat.shine();
        } else {
            System.out.println("Thermostat is null.");
        }
    }
}
