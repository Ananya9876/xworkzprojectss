package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.cupboard.Cupboard;
import com.xworkz.inheritence.internal.cupboard.Door;

public class CupboardRunner {
    public static void main(String[] args) {
        Cupboard cupboard =new Door();
        cupboard.close();
        cupboard.key();
        cupboard.lock();
        cupboard.handle();
        cupboard.open();

        System.out.println("-----------");
        Door door=new Door();
        door.close();
        door.key();
        door.handle();
        door.open();
        door.lock();

    }

}
