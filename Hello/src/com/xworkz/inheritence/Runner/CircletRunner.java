package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.circlet.Circlet;
import com.xworkz.inheritence.internal.circlet.Type;

public class CircletRunner {
    public static void main(String[] args) {
        Circlet circlet =new Type();
        circlet.size();
        circlet.color();
        circlet.shape();
        circlet.matel();
        circlet.quality();

        System.out.println("----------");
        Type type = new Type();
        type.size();
        type.color();
        type.shape();
        type.matel();
        type.quality();

    }
    }

