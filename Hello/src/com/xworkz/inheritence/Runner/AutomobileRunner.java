package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.automobile.Automobile;
import com.xworkz.inheritence.internal.automobile.Car;

public class AutomobileRunner {
    public static void main(String[] args) {
        Automobile automobile = new Car();
        automobile.move();
        automobile.stop();
        automobile.fuel();
        automobile.speed();
        automobile.transport();

        System.out.println("**************************************");
        Car car=new Car();
        car.move();
        car.stop();
        car.fuel();
        car.speed();
        car.transport();

        System.out.println("**************************************");

    }
}
