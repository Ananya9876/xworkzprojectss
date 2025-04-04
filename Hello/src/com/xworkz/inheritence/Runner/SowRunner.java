package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.sow.Sow;
import com.xworkz.inheritence.internal.sow.WildSow;

public class SowRunner {
    public static void main(String[] args) {
        Sow sow = new WildSow();
        sow.eatEverything();
        sow.liveInMud();
        sow.haveStrongSenseOfSmell();
        sow.socialAnimals();
        sow.intelligent();

        System.out.println("**************************************");
        WildSow wildPig = new WildSow();
        wildPig.eatEverything();
        wildPig.liveInMud();
        wildPig.haveStrongSenseOfSmell();
        wildPig.socialAnimals();
        wildPig.intelligent();

        System.out.println("**************************************");
    }
}
