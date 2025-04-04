package com.xworkz.inheritence.Runner;

import com.xworkz.inheritence.internal.notepad.Notepad;
import com.xworkz.inheritence.internal.notepad.Novel;

public class NotepadRunner {
    public static void main(String[] args) {
        Notepad notepad = new Novel();
        notepad.read();
        notepad.write();
        notepad.publish();
        notepad.genre();
        notepad.pages();

        System.out.println("-----------");

        Novel novel = new Novel();
        novel.read();
        novel.write();
        novel.publish();
        novel.genre();
        novel.pages();
    }
}
