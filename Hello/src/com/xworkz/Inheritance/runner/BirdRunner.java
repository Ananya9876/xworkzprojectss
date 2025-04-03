package com.xworkz.Inheritance.runner;

import com.xworkz.Inheritance.Internal.Bird.Piegon;
import com.xworkz.Inheritance.Internal.Bird.Bird;

public class BirdRunner {
    public static void main(String[] args) {
        Bird bird = new Piegon();
        bird.fly();
        bird.feathers();
        bird.laysEggs();
        bird.sound();
        bird.vision();

        System.out.println("-----------");

        Piegon piegon = new Piegon();
        piegon.fly();
        piegon.feathers();
        piegon.laysEggs();
        piegon.sound();
        piegon.vision();
    }
}
