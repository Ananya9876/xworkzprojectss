package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Monitor;

public class MonitorUser {
    private Monitor monitor;

    public MonitorUser(Monitor monitor) {
        this.monitor = monitor;
        System.out.println("MonitorUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (monitor != null) {
            System.out.println("Monitor is not null.");
            monitor.brew();
        } else {
            System.out.println("Monitor is null.");
        }
    }
}
