package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Frame;

public class FrameImpl implements Frame {
    public void support() {
        System.out.println("support called");
    }
    public void secure() {
        System.out.println("secure called");
    }
    public void stabilize() {
        System.out.println("stabilize called");
    }

}
