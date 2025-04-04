package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.play.Play;
import com.xworkz.inheritence.internal.play.Football;

public class PlayRunner {
    public static void main(String[] args) {
        Play sport = new Football();
        sport.play();
        sport.rules();
        sport.competition();
        sport.team();
        sport.training();

        System.out.println("-----------");

        Football football = new Football();
        football.play();
        football.rules();
        football.competition();
        football.team();
        football.training();
    }
}
