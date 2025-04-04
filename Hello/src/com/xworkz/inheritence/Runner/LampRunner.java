package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.lamp.Lamp;
import com.xworkz.inheritence.internal.lamp.Light;

public class LampRunner {
    public static void main(String[] args) {
        Lamp lamp = new Light();
        lamp.color();
        lamp.shape();
        lamp.size();
        lamp.appearance();
        lamp.use();

        System.out.println("-----------------");
        Light light = new Light();
        light.color();
        light.shape();
        light.size();
        light.appearance();
        light.use();
    }
}
