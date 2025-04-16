package com.xworkz.interfaces.interface1;


interface Tool {
    void use();
    void maintain();
    void store();
}

public class Toolbar implements Tool {
    public void use() {
        System.out.println("Usage....");
    }
    public void maintain() {
        System.out.println("Good maintenance....");
    }
    public void store() {
        System.out.println("Storage of the tools....");
    }
}
