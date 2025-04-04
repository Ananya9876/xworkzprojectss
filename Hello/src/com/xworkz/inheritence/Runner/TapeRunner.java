package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.tape.Tape;
import com.xworkz.inheritence.internal.tape.RubberTape;

public class TapeRunner {
    public static void main(String[] args) {
        Tape tape = new RubberTape();
        tape.usedForBinding();
        tape.madeOfElasticMaterial();
        tape.availableInDifferentSizes();
        tape.stretchesEasily();
        tape.usedForVariousPurposes();

        System.out.println("**************************************");
        RubberTape rubberBand = new RubberTape();
        rubberBand.usedForBinding();
        rubberBand.madeOfElasticMaterial();
        rubberBand.availableInDifferentSizes();
        rubberBand.stretchesEasily();
        rubberBand.usedForVariousPurposes();

        System.out.println("**************************************");
    }
}
