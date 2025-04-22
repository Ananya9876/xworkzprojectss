package com.xworkz.abstraction.internal;

public class PrinterImpl implements Printer {
    @Override
    public void monitor() {
        System.out.println("Monitoring the system in Printer.");
    }
}
