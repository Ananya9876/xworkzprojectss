package com.xworkz.interfaces.interface1.Device;

public class DeviceImpl implements Device {
    public void powerUp() {
        System.out.println("powerUp called");
    }
    public void powerDown() {
        System.out.println("powerDown called");
    }
    public void reset() {
        System.out.println("reset called");
    }
    public static void main(String[] args) {
        Device obj = new DeviceImpl();
        obj.powerUp();
        obj.powerDown();
        obj.reset();
    }
}
