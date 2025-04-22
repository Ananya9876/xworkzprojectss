package com.xworkz.abstraction.internal;

public class GameConsoleImpl implements GameConsole {
    @Override
    public void alarm() {
        System.out.println("Setting the alarm in GameConsole.");
    }
}
