package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.outfit.Outfit;
import com.xworkz.inheritence.internal.outfit.WeddingOutfit;

public class OutfitRunner {
    public static void main(String[] args) {
        Outfit outfit = new WeddingOutfit();
        outfit.wornOnSpecialOccasions();
        outfit.madeOfExpensiveFabric();
        outfit.availableInDifferentStyles();
        outfit.enhancesPersonality();
        outfit.requiresProperFitting();

        System.out.println("-----------------");
        WeddingOutfit weddingSuit = new WeddingOutfit();
        weddingSuit.wornOnSpecialOccasions();
        weddingSuit.madeOfExpensiveFabric();
        weddingSuit.availableInDifferentStyles();
        weddingSuit.enhancesPersonality();
        weddingSuit.requiresProperFitting();
    }
}
