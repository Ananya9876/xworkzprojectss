package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Camera;

public class CameraUser {
    private Camera camera;

    public CameraUser(Camera camera) {
        this.camera = camera;
        System.out.println("CameraUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (camera != null) {
            System.out.println("Camera is not null.");
            camera.grind();
        } else {
            System.out.println("Camera is null.");
        }
    }
}
