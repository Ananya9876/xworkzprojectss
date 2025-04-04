package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.gathering.Gathering;
import com.xworkz.inheritence.internal.gathering.BirthdayGathering;

public class GatheringRunner {
    public static void main(String[] args) {
        Gathering gathering = new BirthdayGathering();
        gathering.invitePeople();
        gathering.haveFood();
        gathering.playMusic();
        gathering.dance();
        gathering.decorateVenue();

        System.out.println("-----------------");
        BirthdayGathering birthdayParty = new BirthdayGathering();
        birthdayParty.invitePeople();
        birthdayParty.haveFood();
        birthdayParty.playMusic();
        birthdayParty.dance();
        birthdayParty.decorateVenue();
    }
}
