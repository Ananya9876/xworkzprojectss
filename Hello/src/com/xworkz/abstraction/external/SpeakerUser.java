package com.xworkz.abstraction.external;

import com.xworkz.abstraction.internal.Speaker;

public class SpeakerUser {
    private Speaker speaker;

    public SpeakerUser(Speaker speaker) {
        this.speaker = speaker;
        System.out.println("SpeakerUser is initialized.");
    }

    public void execute() {
        System.out.println("Execution is under progress...");
        if (speaker != null) {
            System.out.println("Speaker is not null.");
            speaker.stream();
        } else {
            System.out.println("Speaker is null.");
        }
    }
}
