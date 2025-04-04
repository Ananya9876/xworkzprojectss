package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.couch.Couch;
import com.xworkz.inheritence.internal.couch.KingSizeCouch;

public class CouchRunner {
    public static void main(String[] args) {
        Couch couch = new KingSizeCouch();
        couch.sleep();
        couch.fold();
        couch.comfort();
        couch.decorate();
        couch.adjustHeight();

        System.out.println("-----------------");
        KingSizeCouch kingSizeBed = new KingSizeCouch();
        kingSizeBed.sleep();
        kingSizeBed.fold();
        kingSizeBed.comfort();
        kingSizeBed.decorate();
        kingSizeBed.adjustHeight();
    }
}
