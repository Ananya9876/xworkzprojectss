package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Connector;

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

}
