package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.bloom.Bloom;
import com.xworkz.inheritence.internal.bloom.RedBloom;

public class BloomRunner {
    public static void main(String[] args) {
        Bloom bloom = new RedBloom();
        bloom.hasFragrance();
        bloom.comesInDifferentColors();
        bloom.usedForDecoration();
        bloom.hasThorns();
        bloom.symbolizesLove();

        System.out.println("-----------------");
        RedBloom redRose = new RedBloom();
        redRose.hasFragrance();
        redRose.comesInDifferentColors();
        redRose.usedForDecoration();
        redRose.hasThorns();
        redRose.symbolizesLove();
    }
}
