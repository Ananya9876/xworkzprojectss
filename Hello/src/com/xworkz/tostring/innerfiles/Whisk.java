package com.xworkz.tostring.innerfiles;

public class Whisk {
    private int intensity;
    private String power;
    private double duration;

    public Whisk(int intensity, String power, double duration) {
        this.intensity = intensity;
        this.power = power;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Whisk [intensity=" + intensity + ", power=" + power + ", duration=" + duration + "]";
    }
}
