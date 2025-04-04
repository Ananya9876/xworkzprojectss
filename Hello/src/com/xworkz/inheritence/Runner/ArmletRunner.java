package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.armlet.Armlet;
import com.xworkz.inheritence.internal.armlet.GoldArmlet;

public class ArmletRunner {
    public static void main(String[] args) {
        Armlet armlet = new GoldArmlet();
        armlet.wornOnWrist();
        armlet.madeOfDifferentMaterials();
        armlet.traditionalJewelry();
        armlet.availableInVariousDesigns();
        armlet.symbolizeMaritalStatus();

        System.out.println("**************************************");
        GoldArmlet goldBangles = new GoldArmlet();
        goldBangles.wornOnWrist();
        goldBangles.madeOfDifferentMaterials();
        goldBangles.traditionalJewelry();
        goldBangles.availableInVariousDesigns();
        goldBangles.symbolizeMaritalStatus();

        System.out.println("**************************************");
    }
}
