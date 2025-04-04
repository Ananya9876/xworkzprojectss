package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.formal.Formal;
import com.xworkz.inheritence.internal.formal.SilkFormal;

public class FormalRunner {
    public static void main(String[] args) {
        Formal formal = new SilkFormal();
        formal.traditionalWear();
        formal.comfortable();
        formal.wornOnFestivals();
        formal.comesInVariousDesigns();
        formal.pairedWithPajama();

        System.out.println("**************************************");
        SilkFormal silkKurta = new SilkFormal();
        silkKurta.traditionalWear();
        silkKurta.comfortable();
        silkKurta.wornOnFestivals();
        silkKurta.comesInVariousDesigns();
        silkKurta.pairedWithPajama();

        System.out.println("**************************************");
    }
}
