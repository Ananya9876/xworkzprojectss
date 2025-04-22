package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Calculator;

public class CalculatorUser {
    private Calculator calculator;

    public CalculatorUser(Calculator calculator) {
        this.calculator = calculator;
        System.out.println("CalculatorUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (calculator != null) {
            System.out.println("Calculator is not null.");
            calculator.cool();
        } else {
            System.out.println("Calculator is null.");
        }
    }
}
