package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Cover;

public class CoverImpl implements Cover {
    public void place() {
        System.out.println("place called");
    }
    public void remove() {
        System.out.println("remove called");
    }
    public void protect() {
        System.out.println("protect called");
    }

    public void clean() {
        System.out.println("Cleaning the cover..");
    }
}
