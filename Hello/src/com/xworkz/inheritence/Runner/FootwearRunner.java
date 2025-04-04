package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.footwear.Footwear;
import com.xworkz.inheritence.internal.footwear.SportsFootwear;

public class FootwearRunner {
    public static void main(String[] args) {
        Footwear footwear = new SportsFootwear();
        footwear.protectsFeet();
        footwear.providesComfort();
        footwear.comesInVariousStyles();
        footwear.madeFromDifferentMaterials();
        footwear.availableInDifferentSizes();

        System.out.println("**************************************");
        SportsFootwear sportsShoe = new SportsFootwear();
        sportsShoe.protectsFeet();
        sportsShoe.providesComfort();
        sportsShoe.comesInVariousStyles();
        sportsShoe.madeFromDifferentMaterials();
        sportsShoe.availableInDifferentSizes();

        System.out.println("**************************************");
    }
}
