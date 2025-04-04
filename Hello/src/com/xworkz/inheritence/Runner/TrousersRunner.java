package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.trousers.Trousers;
import com.xworkz.inheritence.internal.trousers.JeansTrousers;

public class TrousersRunner {
    public static void main(String[] args) {
        Trousers trousers = new JeansTrousers();
        trousers.wear();
        trousers.madeOfFabric();
        trousers.availableInDifferentStyles();
        trousers.provideComfort();
        trousers.comesInVariousSizes();

        System.out.println("**************************************");
        JeansTrousers jeansPant = new JeansTrousers();
        jeansPant.wear();
        jeansPant.madeOfFabric();
        jeansPant.availableInDifferentStyles();
        jeansPant.provideComfort();
        jeansPant.comesInVariousSizes();

        System.out.println("**************************************");
    }
}
