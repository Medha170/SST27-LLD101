package com.example.video;

import java.nio.file.Path;

public class VideoPipelineFacade {
    Path process(Path src, Path out, boolean gray, Double scale, Integer strength){
        Decoder dec = new Decoder();
        FilterEngine fe = new FilterEngine();
        Encoder enc = new Encoder();
        SharpenAdapter sa = new SharpenAdapter();

        Frame[] frames = dec.decode(src);
        if (gray) frames = fe.grayscale(frames);
        if (scale > 0) frames = fe.scale(frames, scale);
        if (strength > 0) frames = sa.applySharpen(frames, strength);
        return enc.encode(frames, out);
    }
}
