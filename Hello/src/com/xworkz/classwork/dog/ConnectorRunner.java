package com.xworkz.classwork.dog;

public class ConnectorRunner {
    public static void main(String[] args) {
        Connector connector=new ConnectorImp();

        ConnectorUser user=new ConnectorUser(connector);
        user.execute();
        Connector.jump();
    }
}
