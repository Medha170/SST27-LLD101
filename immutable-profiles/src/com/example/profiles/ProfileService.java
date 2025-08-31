package com.example.profiles;

import java.util.Objects;

/**
 * Assembles profiles with scattered, inconsistent validation.
 */
public class ProfileService {

    // returns a fully built profile but mutates it afterwards (bug-friendly)
    public UserProfile createMinimal(String id, String email) {
        // later code keeps mutating...
        return new UserProfile.UserProfileBuilder(id, email).build();
    }

    public void updateDisplayName(UserProfile p, String displayName) {
        Objects.requireNonNull(p, "profile");
        
        new UserProfile.UserProfileBuilder(p.getId(), p.getEmail())
            .setDisplayName(displayName)
            .build();
    }
}
