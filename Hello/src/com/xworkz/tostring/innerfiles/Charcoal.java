package com.xworkz.tostring.innerfiles;

public class Charcoal {
    private int intensity;
    private String texture;
    private double material;

    public Charcoal(int intensity, String texture, double material) {
        this.intensity = intensity;
        this.texture = texture;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Charcoal [intensity=" + intensity + ", texture=" + texture + ", material=" + material + "]";
    }
}
