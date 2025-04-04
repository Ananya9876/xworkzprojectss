package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.stream.Stream;
import com.xworkz.inheritence.internal.stream.Nile;

public class StreamRunner {
    public static void main(String[] args) {
        Stream stream = new Nile();
        stream.length();
        stream.origin();
        stream.flows();
        stream.providesWater();
        stream.wildlife();

        System.out.println("**************************************");

        Nile nile = new Nile();
        nile.length();
        nile.origin();
        nile.flows();
        nile.providesWater();
        nile.wildlife();

        System.out.println("**************************************");
    }
}
