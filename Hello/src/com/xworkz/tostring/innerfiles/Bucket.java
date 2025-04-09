package com.xworkz.tostring.innerfiles;

public class Bucket {
    private int size;
    private String duration;
    private double volume;

    public Bucket(int size, String duration, double volume) {
        this.size = size;
        this.duration = duration;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Bucket: size=" + size + ", duration=" + duration + ", volume=" + volume;
    }
}
