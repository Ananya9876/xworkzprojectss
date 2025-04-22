package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.DeepFreezer;

public class DeepFreezerUser {
    private DeepFreezer deepfreezer;

    public DeepFreezerUser(DeepFreezer deepfreezer) {
        this.deepfreezer = deepfreezer;
        System.out.println("DeepFreezerUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (deepfreezer != null) {
            System.out.println("DeepFreezer is not null.");
            deepfreezer.view();
        } else {
            System.out.println("DeepFreezer is null.");
        }
    }
}
