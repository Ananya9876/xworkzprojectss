package com.xworkz.interfaces.interface1.Spring;

public class SpringImpl implements Spring {
    public void compress() {
        System.out.println("compress called");
    }
    public void release() {
        System.out.println("release called");
    }
    public void bounce() {
        System.out.println("bounce called");
    }
    public static void main(String[] args) {
        Spring obj = new SpringImpl();
        obj.compress();
        obj.release();
        obj.bounce();
    }
}
