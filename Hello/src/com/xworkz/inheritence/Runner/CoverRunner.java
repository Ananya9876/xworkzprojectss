package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.cover.Cover;
import com.xworkz.inheritence.internal.cover.BookCover;

public class CoverRunner {
    public static void main(String[] args) {

        Cover cover = new Cover();
        cover.protect();
        cover.design();
        cover.provideGrip();
        cover.waterproof();
        cover.enhanceLook();
        System.out.println("**************************************");
        Cover cover1 = new BookCover();
        cover1.protect();
        cover1.design();
        cover1.provideGrip();
        cover1.waterproof();
        cover1.enhanceLook();

        System.out.println("**************************************");
        BookCover bookCover = new BookCover();
        bookCover.protect();
        bookCover.design();
        bookCover.provideGrip();
        bookCover.waterproof();
        bookCover.enhanceLook();
    }
}
