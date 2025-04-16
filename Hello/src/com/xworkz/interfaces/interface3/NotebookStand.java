package com.xworkz.interfaces.interface3;

import com.xworkz.interfaces.interfaceclass.Processor;

public class NotebookStand implements Vehicle, Instrument, Machine, Device, Processor {


    public void compute() {
        System.out.println("compute called");
    }
    public void analyze() {
        System.out.println("analyze called");
    }
    public void optimize() {
        System.out.println("optimize called");
    }


}
