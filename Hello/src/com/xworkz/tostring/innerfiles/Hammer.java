package com.xworkz.tostring.innerfiles;

public class Hammer {
    private int material;
    private String shape;
    private double weight;

    public Hammer(int material, String shape, double weight) {
        this.material = material;
        this.shape = shape;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Hammer [material=" + material + ", material=" + shape + ", weight=" + weight + "]";
    }
}
