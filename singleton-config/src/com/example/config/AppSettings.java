package com.example.config;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

/**
 * FAULTY "Singleton": public constructor, getInstance() returns a NEW instance each time,
 * not thread-safe, reload allowed anytime, mutable global state, reflection+serialization-friendly.
 */
public class AppSettings implements Serializable {
    private volatile Properties props = new Properties();

    private AppSettings() {
        if (Nested.INSTANCE != null) throw new IllegalStateException();
    } // should not be public for true singleton

    private static class Nested {
        private static AppSettings INSTANCE = new AppSettings();
    }

    public static AppSettings getInstance() {
        return Nested.INSTANCE; // returns a fresh instance (bug)
    }

    protected Object readResolve(){
        return getInstance();
    }

    public void loadFromFile(Path file) {
        Properties newProps = new Properties();
        try (InputStream in = Files.newInputStream(file)) {
            newProps.load(in);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
        this.props = newProps;
    }

    public String get(String key) {
        return props.getProperty(key);
    }
}
