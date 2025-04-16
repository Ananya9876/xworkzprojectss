package com.xworkz.interfaces.interface1.Processor;

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
    public static void main(String[] args) {
        Processor obj = new ProcessorImpl();
        obj.compute();
        obj.analyze();
        obj.optimize();
    }
}
