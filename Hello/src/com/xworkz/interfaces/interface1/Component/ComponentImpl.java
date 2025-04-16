package com.xworkz.interfaces.interface1.Component;

public class ComponentImpl implements Component {
    public void fit() {
        System.out.println("fit called");
    }
    public void remove() {
        System.out.println("remove called");
    }
    public void test() {
        System.out.println("test called");
    }
    public static void main(String[] args) {
        Component obj = new ComponentImpl();
        obj.fit();
        obj.remove();
        obj.test();
    }
}
