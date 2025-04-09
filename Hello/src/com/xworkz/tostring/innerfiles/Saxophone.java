package com.xworkz.tostring.innerfiles;

public class Saxophone {
    private int color;
    private String brand;
    private double shape;

    public Saxophone(int color, String brand, double shape) {
        this.color = color;
        this.brand = brand;
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Saxophone [color=" + color + ", color=" + brand + ", shape=" + shape + "]";
    }
}
