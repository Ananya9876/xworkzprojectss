package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.meal.Meal;
import com.xworkz.inheritence.internal.meal.Burger;

public class MealRunner {
    public static void main(String[] args) {
        Meal meal = new Burger();
        meal.eat();
        meal.taste();
        meal.cook();
        meal.healthy();
        meal.spicy();

        System.out.println("--------------");
        Burger burger=new Burger();
        burger.eat();
        burger.taste();
        burger.cook();
        burger.healthy();
        burger.spicy();

    }
}
