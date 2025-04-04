package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.figure.Figure;
import com.xworkz.inheritence.internal.figure.Circle;

public class FigureRunner {
    public static void main(String[] args) {
        Figure figure = new Circle();
        figure.draw();
        figure.area();
        figure.perimeter();
        figure.color();
        figure.dimension();

        System.out.println("**************************************");
        Circle circle=new Circle();
        circle.draw();
        circle.area();
        circle.perimeter();
        circle.color();
        circle.dimension();

        System.out.println("**************************************");
    }
}
