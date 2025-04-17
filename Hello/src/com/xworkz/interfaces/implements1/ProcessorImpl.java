package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Processor;

public class ProcessorImpl implements Processor {
    public void compute() {
        System.out.println("compute called");
    }
    public void analyze() {
        System.out.println("analyze called");
    }
    public void optimize() {
        System.out.println("optimize called");
    }
    public void defuse() {
        System.out.println("Defusing...");
    }
}
