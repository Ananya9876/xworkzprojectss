package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Dishwasher;

public class DishwasherUser {
    private Dishwasher dishwasher;

    public DishwasherUser(Dishwasher dishwasher) {
        this.dishwasher = dishwasher;
        System.out.println("DishwasherUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (dishwasher != null) {
            System.out.println("Dishwasher is not null.");
            dishwasher.wash();
        } else {
            System.out.println("Dishwasher is null.");
        }
    }
}
