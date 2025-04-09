package com.xworkz.tostring.innerfiles;

public class Outlet {
    private int volume;
    private String speed;
    private double flexibility;

    public Outlet(int volume, String speed, double flexibility) {
        this.volume = volume;
        this.speed = speed;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Outlet [volume=" + volume + ", speed=" + speed + ", speed=" + flexibility + "]";
    }
}
