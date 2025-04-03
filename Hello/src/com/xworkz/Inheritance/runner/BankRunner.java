package com.xworkz.Inheritance.runner;

import com.xworkz.Inheritance.Internal.Bank.Bank;
import com.xworkz.Inheritance.Internal.Bank.Customerprofile;

public class BankRunner {
    public static void main(String[] args) {
        Bank bank=new Customerprofile();
        bank.add();
        bank.update();
        bank.edit();
        bank.delete();
        bank.rename();

        System.out.println("-----------");

        Customerprofile profile=new Customerprofile();
        profile.add();
        profile.update();
        profile.edit();
        profile.delete();
        profile.rename();
    }
}
