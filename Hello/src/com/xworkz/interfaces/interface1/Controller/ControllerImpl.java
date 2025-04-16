package com.xworkz.interfaces.interface1.Controller;

public class ControllerImpl implements Controller {
    public void program() {
        System.out.println("program called");
    }
    public void execute() {
        System.out.println("execute called");
    }
    public void reset() {
        System.out.println("reset called");
    }
    public static void main(String[] args) {
        Controller obj = new ControllerImpl();
        obj.program();
        obj.execute();
        obj.reset();
    }
}
