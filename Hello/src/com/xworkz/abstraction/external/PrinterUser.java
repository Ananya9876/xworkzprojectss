package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Printer;

public class PrinterUser {
    private Printer printer;

    public PrinterUser(Printer printer) {
        this.printer = printer;
        System.out.println("PrinterUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (printer != null) {
            System.out.println("Printer is not null.");
            printer.monitor();
        } else {
            System.out.println("Printer is null.");
        }
    }
}
