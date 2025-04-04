package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.flora.Flora;
import com.xworkz.inheritence.internal.flora.Flower;

public class FloraRunner {
    public static void main(String[] args) {
        Flora flora = new Flower();
        flora.grow();
        flora.photosynthesis();
        flora.absorbWater();
        flora.provideOxygen();
        flora.reproduce();

        System.out.println("**************************************");

        Flower flower = new Flower();
        flower.grow();
        flower.photosynthesis();
        flower.absorbWater();
        flower.provideOxygen();
        flower.reproduce();

        System.out.println("**************************************");
    }
}
