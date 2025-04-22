package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.SecurityCamera;

public class SecurityCameraUser {
    private SecurityCamera securitycamera;

    public SecurityCameraUser(SecurityCamera securitycamera) {
        this.securitycamera = securitycamera;
        System.out.println("SecurityCameraUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (securitycamera != null) {
            System.out.println("SecurityCamera is not null.");
            securitycamera.read();
        } else {
            System.out.println("SecurityCamera is null.");
        }
    }
}
