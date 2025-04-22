package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.GameConsole;

public class GameConsoleUser {
    private GameConsole gameconsole;

    public GameConsoleUser(GameConsole gameconsole) {
        this.gameconsole = gameconsole;
        System.out.println("GameConsoleUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (gameconsole != null) {
            System.out.println("GameConsole is not null.");
            gameconsole.alarm();
        } else {
            System.out.println("GameConsole is null.");
        }
    }
}
