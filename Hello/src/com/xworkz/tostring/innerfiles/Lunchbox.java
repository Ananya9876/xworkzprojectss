package com.xworkz.tostring.innerfiles;

public class Lunchbox {
    private int shape;
    private String material;
    private double quantity;

    public Lunchbox(int shape, String material, double quantity) {
        this.shape = shape;
        this.material = material;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Lunchbox [shape=" + shape + ", material=" + material + ", material=" + quantity + "]";
    }
}
