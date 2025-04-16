package com.xworkz.interfaces.interface1.Handle;

public class HandleImpl implements Handle {
    public void grip() {
        System.out.println("grip called");
    }
    public void twist() {
        System.out.println("twist called");
    }
    public void pull() {
        System.out.println("pull called");
    }
    public static void main(String[] args) {
        Handle obj = new HandleImpl();
        obj.grip();
        obj.twist();
        obj.pull();
    }
}
