package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Router;

public class RouterUser {
    private Router router;

    public RouterUser(Router router) {
        this.router = router;
        System.out.println("RouterUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (router != null) {
            System.out.println("Router is not null.");
            router.play();
        } else {
            System.out.println("Router is null.");
        }
    }
}
