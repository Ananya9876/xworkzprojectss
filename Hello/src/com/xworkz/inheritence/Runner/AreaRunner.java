package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.area.Area;
import com.xworkz.inheritence.internal.area.Bedroom;

public class AreaRunner {
    public static void main(String[] args) {
        Area area = new Bedroom();
        area.enter();
        area.decorate();
        area.clean();
        area.ventilate();

        System.out.println("**************************************");
        Bedroom bedroom = new Bedroom();
        bedroom.enter();
        bedroom.decorate();
        bedroom.clean();
        bedroom.ventilate();

        System.out.println("**************************************");
    }
}
