package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.MixerGrinder;

public class MixerGrinderUser {
    private MixerGrinder mixergrinder;

    public MixerGrinderUser(MixerGrinder mixergrinder) {
        this.mixergrinder = mixergrinder;
        System.out.println("MixerGrinderUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (mixergrinder != null) {
            System.out.println("MixerGrinder is not null.");
            mixergrinder.upload();
        } else {
            System.out.println("MixerGrinder is null.");
        }
    }
}
