package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.VRHeadset;

public class VRHeadsetUser {
    private VRHeadset vrheadset;

    public VRHeadsetUser(VRHeadset vrheadset) {
        this.vrheadset = vrheadset;
        System.out.println("VRHeadsetUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (vrheadset != null) {
            System.out.println("VRHeadset is not null.");
            vrheadset.start();
        } else {
            System.out.println("VRHeadset is null.");
        }
    }
}
