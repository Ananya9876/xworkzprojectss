package com.xworkz.interfaces.implements1;

import com.xworkz.interfaces.interfaceclass.Tool;

public class ToolImpl implements Tool {
    public void use() {
        System.out.println("use called");
    }
    public void maintain() {
        System.out.println("maintain called");
    }
    public void store() {
        System.out.println("store called");
    }
    public void operate() {
        System.out.println("Robot performing operation...");
    }
}
