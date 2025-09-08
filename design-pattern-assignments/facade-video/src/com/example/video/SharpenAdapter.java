package com.example.video;

public class SharpenAdapter {
    private final LegacySharpen ls = new LegacySharpen();
    public Frame[] applySharpen(Frame[] frames, int strength){
        String handle = FrameRegistry.register(frames);
        String newHandle = ls.applySharpen(handle, strength);
        return FrameRegistry.deregister(newHandle);
    }
}
