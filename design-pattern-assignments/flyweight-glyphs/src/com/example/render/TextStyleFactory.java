package com.example.render;

import java.util.HashMap;
import java.util.Map;

public final class TextStyleFactory {
    private static final Map<String, TextStyle> styles = new HashMap<>();
    
    public static TextStyle get(String font, int size, boolean bold) {
        String key = font + "|" + size + "|" + bold;
        return styles.computeIfAbsent(key, k -> new TextStyle(font, size, bold));
    }
}
