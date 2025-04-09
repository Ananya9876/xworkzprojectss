package com.xworkz.tostring.innerfiles;

public class ChargerCable {
    private int capacity;
    private String flexibility;
    private double intensity;

    public ChargerCable(int capacity, String flexibility, double intensity) {
        this.capacity = capacity;
        this.flexibility = flexibility;
        this.intensity = intensity;
    }

    @Override
    public String toString() {
        return "ChargerCable [capacity=" + capacity + ", flexibility=" + flexibility + ", intensity=" + intensity + "]";
    }
}
