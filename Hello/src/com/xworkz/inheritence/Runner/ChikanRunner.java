package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.chikan.Chikan;
import com.xworkz.inheritence.internal.chikan.ChikanEmbroidery;

public class ChikanRunner {
    public static void main(String[] args) {
        Chikan chikan = new ChikanEmbroidery();
        chikan.traditionalArt();
        chikan.handcrafted();
        chikan.originatedInLucknow();
        chikan.delicateDesigns();
        chikan.usedOnFabrics();

        System.out.println("-----------------");
        ChikanEmbroidery chikanEmbroidery = new ChikanEmbroidery();
        chikanEmbroidery.traditionalArt();
        chikanEmbroidery.handcrafted();
        chikanEmbroidery.originatedInLucknow();
        chikanEmbroidery.delicateDesigns();
        chikanEmbroidery.usedOnFabrics();
    }
}
