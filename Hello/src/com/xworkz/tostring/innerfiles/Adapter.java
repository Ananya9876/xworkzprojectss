package com.xworkz.tostring.innerfiles;

public class Adapter {
    private int range;
    private String color;
    private double size;

    public Adapter(int range, String color, double size) {
        this.range = range;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Adapter has :range= " + range + ", color= " + color + ", size= " + size ;
    }
}
