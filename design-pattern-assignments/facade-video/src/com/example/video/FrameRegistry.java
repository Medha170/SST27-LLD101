package com.example.video;

public class FrameRegistry {
    static String register(Frame[] frames){
        return "HANDLE";
    }

    static Frame[] deregister(String handle){
        return new Frame[] { new Frame(1920,1080), new Frame(1920,1080) };
    }
}
