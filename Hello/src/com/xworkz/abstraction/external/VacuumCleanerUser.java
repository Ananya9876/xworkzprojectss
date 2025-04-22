package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.VacuumCleaner;

public class VacuumCleanerUser {
    private VacuumCleaner vacuumcleaner;

    public VacuumCleanerUser(VacuumCleaner vacuumcleaner) {
        this.vacuumcleaner = vacuumcleaner;
        System.out.println("VacuumCleanerUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (vacuumcleaner != null) {
            System.out.println("VacuumCleaner is not null.");
            vacuumcleaner.connect();
        } else {
            System.out.println("VacuumCleaner is null.");
        }
    }
}
