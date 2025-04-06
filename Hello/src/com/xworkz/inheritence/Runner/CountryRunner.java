package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.country.Country;
import com.xworkz.inheritence.internal.country.India;

public class CountryRunner {
    public static void main(String[] args) {


        Country country = new Country();
        country.name();
        country.population();
        country.culture();
        country.economy();
        country.government();
        System.out.println("**************************************");
        Country country1 = new India();
        country1.name();
        country1.population();
        country1.culture();
        country1.economy();
        country1.government();

        System.out.println("**************************************");
        India india=new India();
        india.name();
        india.population();
        india.culture();
        india.economy();
        india.government();


    }
}
