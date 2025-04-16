package com.xworkz.interfaces.interface1.Frame;

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
    public static void main(String[] args) {
        Frame obj = new FrameImpl();
        obj.support();
        obj.secure();
        obj.stabilize();
    }
}
