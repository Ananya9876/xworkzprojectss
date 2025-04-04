package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.wild.Wild;
import com.xworkz.inheritence.internal.wild.Fish;

public class WildRunner {
    public static void main(String[] args) {
        Wild wild = new Fish();
        wild.eat();
        wild.sleep();
        wild.sound();
        wild.run();
        wild.breathe();

        System.out.println("**************************************");
        Fish fish=new Fish();
        fish.eat();
        fish.sleep();
        fish.sound();
        fish.run();
        fish.breathe();

        System.out.println("**************************************");

    }
}
