package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Structure;

public class StructureImpl implements Structure {
    public void build() {
        System.out.println("build called");
    }
    public void strengthen() {
        System.out.println("strengthen called");
    }
    public void maintain() {
        System.out.println("maintain called");
    }

}
