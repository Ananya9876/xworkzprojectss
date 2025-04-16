package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Device;

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

}
