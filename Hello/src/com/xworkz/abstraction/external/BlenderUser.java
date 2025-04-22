package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Blender;

public class BlenderUser {
    private Blender blender;

    public BlenderUser(Blender blender) {
        this.blender = blender;
        System.out.println("BlenderUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (blender != null) {
            System.out.println("Blender is not null.");
            blender.navigate();
        } else {
            System.out.println("Blender is null.");
        }
    }
}
