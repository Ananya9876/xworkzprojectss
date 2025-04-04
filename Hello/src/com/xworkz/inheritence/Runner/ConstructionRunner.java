package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.construction.Construction;
import com.xworkz.inheritence.internal.construction.House;

public class ConstructionRunner {
    public static void main(String[] args) {
        Construction construction =new House();
        construction.shelter();
        construction.structure();
        construction.floors();
        construction.foundation();

        System.out.println("-----------");
        House house = new House();
        house.shelter();
        house.structure();
        house.floors();
        house.foundation();
    }
}
