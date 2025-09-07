package com.example.imports;

import java.nio.file.Path;

public class CsvProfileImporter implements ProfileImporter {
    NaiveCsvReader reader;
    ProfileService service;

    public CsvProfileImporter(NaiveCsvReader reader, ProfileService service) {
        this.reader = reader;
        this.service = service;
    }

    @Override
    public int importFrom(Path csvFile) {
        int n = 0;
        for (String[] row : reader.read(csvFile)) {
            try {
                // Ensure row has all 3 columns
                if (row.length < 3) {
                    System.out.println("Skipping row: not enough columns");
                    continue;
                }

                service.createProfile(row[0], row[1], row[2]);
                n++;
            }
            catch (IllegalArgumentException e) {
                System.out.println("Skipping row: " + e.getMessage());
            }
        }
        return n;
    }

    
}
