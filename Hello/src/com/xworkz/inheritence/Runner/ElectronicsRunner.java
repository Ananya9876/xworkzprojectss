package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.electronicDevice.ElectronicDevice;
import com.xworkz.inheritence.internal.electronicDevice.Mobile;

public class ElectronicsRunner {

        public static void main(String[] args) {


            ElectronicDevice device=new ElectronicDevice();
            device.powerOn();
            device.powerOff();
            device.battery();
            device.charge();
            System.out.println("**************************************");
            ElectronicDevice device2 =new Mobile();
            device2.powerOn();
            device2.powerOff();
            device2.battery();
            device2.charge();

            System.out.println("**************************************");
            Mobile mobile = new Mobile();
            mobile.powerOn();
            mobile.powerOff();
            mobile.battery();
            mobile.charge();
        }
    }



