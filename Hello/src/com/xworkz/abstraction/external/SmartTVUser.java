package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.SmartTV;

public class SmartTVUser {
    private SmartTV smarttv;

    public SmartTVUser(SmartTV smarttv) {
        this.smarttv = smarttv;
        System.out.println("SmartTVUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (smarttv != null) {
            System.out.println("SmartTV is not null.");
            smarttv.rotate();
        } else {
            System.out.println("SmartTV is null.");
        }
    }
}
