package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Projector;

public class ProjectorUser {
    private Projector projector;

    public ProjectorUser(Projector projector) {
        this.projector = projector;
        System.out.println("ProjectorUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (projector != null) {
            System.out.println("Projector is not null.");
            projector.cook();
        } else {
            System.out.println("Projector is null.");
        }
    }
}
