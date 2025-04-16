package com.xworkz.interfaces.interface1.Cover;

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
    public static void main(String[] args) {
        Cover obj = new CoverImpl();
        obj.place();
        obj.remove();
        obj.protect();
    }
}
