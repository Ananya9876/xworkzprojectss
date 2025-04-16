package com.xworkz.interfaces.interface2;

import com.xworkz.interfaces.interfaceclass.Cover;
import com.xworkz.interfaces.interfaceclass.Device;

public class MultiTwoImpl12 implements Cover, Device {
    public void place() {
        System.out.println("place called");
    }
    public void remove() {
        System.out.println("remove called");
    }
    public void protect() {
        System.out.println("protect called");
    }
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
