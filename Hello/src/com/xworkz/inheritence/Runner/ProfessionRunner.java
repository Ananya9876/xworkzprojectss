package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.profession.Engineer;
import com.xworkz.inheritence.internal.profession.Profession;

public class ProfessionRunner {
    public static void main(String[] args) {
        Profession profession=new Engineer();
        profession.work();
        profession.salary();
        profession.skills();
        profession.education();

        System.out.println("-----------");
        Engineer engineer = new Engineer();
        engineer.work();
        engineer.salary();
        engineer.skills();
        engineer.education();
    }
}
