package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.sweetened.Sweetened;
import com.xworkz.inheritence.internal.sweetened.GulabJamun;

public class SweetenedRunner {
    public static void main(String[] args) {
        Sweetened sweetened = new GulabJamun();
        sweetened.taste();
        sweetened.madeWithSugar();
        sweetened.serveInFestivals();
        sweetened.store();
        sweetened.giftToOthers();

        System.out.println("**************************************");
        GulabJamun gulabJamun = new GulabJamun();
        gulabJamun.taste();
        gulabJamun.madeWithSugar();
        gulabJamun.serveInFestivals();
        gulabJamun.store();
        gulabJamun.giftToOthers();

        System.out.println("**************************************");
    }
}
