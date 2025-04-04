package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.lungs.Lungs;
import com.xworkz.inheritence.internal.lungs.HealthyLungs;

public class LungsRunner {
    public static void main(String[] args) {
        Lungs lungs = new HealthyLungs();
        lungs.pumpsBlood();
        lungs.beatsContinuously();
        lungs.suppliesOxygen();
        lungs.removesWaste();
        lungs.worksInCirculatorySystem();

        System.out.println("-----------------");
        HealthyLungs healthyHeart = new HealthyLungs();
        healthyHeart.pumpsBlood();
        healthyHeart.beatsContinuously();
        healthyHeart.suppliesOxygen();
        healthyHeart.removesWaste();
        healthyHeart.worksInCirculatorySystem();
    }
}
