package com.xworkz.interfaces.interface1.Filter;

public class FilterImpl implements Filter {
    public void trap() {
        System.out.println("trap called");
    }
    public void clean() {
        System.out.println("clean called");
    }
    public void replace() {
        System.out.println("replace called");
    }
    public static void main(String[] args) {
        Filter obj = new FilterImpl();
        obj.trap();
        obj.clean();
        obj.replace();
    }
}
