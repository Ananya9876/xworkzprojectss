package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.braclet.Braclet;
import com.xworkz.inheritence.internal.braclet.Type;

public class BracletRunner {
    public static void main(String[] args) {
        Braclet braclet=new Type();
        braclet.size();
        braclet.color();
        braclet.shape();
        braclet.matel();
        braclet.quality();

        System.out.println("----------");
        Type type = new Type();
        type.size();
        type.color();
        type.shape();
        type.matel();
        type.quality();

    }
    }

