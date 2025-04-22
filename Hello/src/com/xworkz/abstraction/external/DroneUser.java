package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Drone;

public class DroneUser {
    private Drone drone;

    public DroneUser(Drone drone) {
        this.drone = drone;
        System.out.println("DroneUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (drone != null) {
            System.out.println("Drone is not null.");
            drone.unlock();
        } else {
            System.out.println("Drone is null.");
        }
    }
}
