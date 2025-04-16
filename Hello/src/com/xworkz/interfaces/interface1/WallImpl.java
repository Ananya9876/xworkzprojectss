package com.xworkz.interfaces.interface1;

import com.xworkz.interfaces.interfaceclass.Wall;

public class WallImpl implements Wall {
    public void erect() {
        System.out.println("erect called");
    }
    public void paint() {
        System.out.println("paint called");
    }
    public void insulate() {
        System.out.println("insulate called");
    }

}
