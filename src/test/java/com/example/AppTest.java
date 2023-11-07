package com.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

public class AppTest {
    private App app;

    @BeforeEach
    void setUp() {
        app = new App();
    }

    @Test
    void testAppWithCustomScanner() {
        // Create a custom scanner with predefined input
        String testInput = "42"; // Example input
        Scanner testScanner = new Scanner(new ByteArrayInputStream(testInput.getBytes()));

        app.setScanner(testScanner);

        // Now you can call your methods in App class that use the scanner
        // and assert their behavior with the custom input
    }
}