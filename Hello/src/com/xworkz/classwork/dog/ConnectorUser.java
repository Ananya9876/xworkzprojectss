package com.xworkz.classwork.dog;

public class ConnectorUser {
    Connector connector;


    ConnectorUser(Connector connector){
        this.connector=connector;
        System.out.println("Connecting...");
    }

    void execute(){
        connector.run();
    }
}
