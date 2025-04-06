package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.fruit.Apple;
import com.xworkz.inheritence.internal.fruit.Fruit;

public class FruitRunner {
    public static void main(String[] args) {


        Fruit fruit=new Fruit();
        fruit.taste();
        fruit.color();
        fruit.nutrients();
        fruit.seasonal();
        System.out.println("**************************************");
        Fruit fruit1 =new Apple();
        fruit1.taste();
        fruit1.color();
        fruit1.nutrients();
        fruit1.seasonal();

        System.out.println("**************************************");
        Apple apple = new Apple();
        apple.taste();
        apple.color();
        apple.nutrients();
        apple.seasonal();
    }
}
