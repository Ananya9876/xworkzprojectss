package com.xworkz.abstraction.internal;

public class ElectricKettleImpl implements ElectricKettle {
    @Override
    public void sync() {
        System.out.println("Syncing data in ElectricKettle.");
    }
}
