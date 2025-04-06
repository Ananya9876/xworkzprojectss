package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.cur.Currency;
import com.xworkz.inheritence.internal.cur.Dollar;

public class CurrRunner {
    public static void main(String[] args) {

        Currency currency=new Currency();
        currency.value();
        currency.exchangeRate();
        currency.symbol();
        currency.usage();
        System.out.println("**************************************");
        Currency currency1 =new Dollar();
        currency1.value();
        currency1.exchangeRate();
        currency1.symbol();
        currency1.usage();

        System.out.println("**************************************");
        Dollar dollar = new Dollar();
        dollar.value();
        dollar.exchangeRate();
        dollar.symbol();
        dollar.usage();
    }
}
