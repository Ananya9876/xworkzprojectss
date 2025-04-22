package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Clock;

public class ClockUser {
    private Clock clock;

    public ClockUser(Clock clock) {
        this.clock = clock;
        System.out.println("ClockUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (clock != null) {
            System.out.println("Clock is not null.");
            clock.heat();
        } else {
            System.out.println("Clock is null.");
        }
    }
}
