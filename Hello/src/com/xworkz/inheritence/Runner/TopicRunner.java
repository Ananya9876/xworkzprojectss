package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.topic.Mathematics;
import com.xworkz.inheritence.internal.topic.Topic;

public class TopicRunner {
    public static void main(String[] args) {
        Topic topic =new Mathematics();
        topic.study();
        topic.exam();
        topic.difficulty();
        topic.syllabus();

        System.out.println("**************************************");
        Mathematics mathematics = new Mathematics();
        mathematics.study();
        mathematics.exam();
        mathematics.difficulty();
        mathematics.syllabus();

        System.out.println("**************************************");
    }
}
