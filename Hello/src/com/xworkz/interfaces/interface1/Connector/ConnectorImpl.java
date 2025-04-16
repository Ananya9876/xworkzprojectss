package com.xworkz.interfaces.interface1.Connector;

public class ConnectorImpl implements Connector {
    public void link() {
        System.out.println("link called");
    }
    public void secure() {
        System.out.println("secure called");
    }
    public void release() {
        System.out.println("release called");
    }
    public static void main(String[] args) {
        Connector obj = new ConnectorImpl();
        obj.link();
        obj.secure();
        obj.release();
    }
}
