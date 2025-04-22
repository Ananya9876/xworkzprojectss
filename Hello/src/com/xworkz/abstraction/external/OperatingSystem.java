package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Laptop;

public class OperatingSystem {
    private Laptop laptop;

    public OperatingSystem(Laptop laptop){
        this.laptop=laptop;
        System.out.println("Os is running");
    }
    public void execute(){
        System.out.println("Execution id under");
        if(laptop!=null){
            System.out.println("Laptop is not null");
        } else {
            System.out.println("Laptop is null");
        }
    }
}
