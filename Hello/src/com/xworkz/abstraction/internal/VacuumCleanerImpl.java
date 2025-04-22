package com.xworkz.abstraction.internal;

public class VacuumCleanerImpl implements VacuumCleaner {
    @Override
    public void connect() {
        System.out.println("Connecting to the network in VacuumCleaner.");
    }
}
