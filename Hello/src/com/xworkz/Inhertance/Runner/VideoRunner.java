package com.xworkz.Inhertance.Runner;

import com.xworkz.Inhertance.internal.Video.Video;
import com.xworkz.Inhertance.internal.Video.Movie;

public class VideoRunner {
    public static void main(String[] args) {
        Video video=new Movie();
        video.clip();
        video.music();
        video.series();
        video.shortfilm();
        video.trailer();

        System.out.println("-----------");

        Movie movie=new Movie();
        movie.clip();
        video.music();
        video.series();
        video.shortfilm();
        video.trailer();
    }
}
