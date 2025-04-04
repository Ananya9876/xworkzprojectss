package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.refreshment.Refreshment;
import com.xworkz.inheritence.internal.refreshment.Coffee;

public class RefreshmentRunner {
    public static void main(String[] args) {
        Refreshment refreshment =new Coffee();
        refreshment.drink();
        refreshment.temperature();
        refreshment.flavor();
        refreshment.refresh();

        System.out.println("-----------");
        Coffee coffee = new Coffee();
        coffee.drink();
        coffee.temperature();
        coffee.flavor();
        coffee.refresh();
    }
}
