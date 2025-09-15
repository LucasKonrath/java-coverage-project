package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testMainMethodOutput() {
        // Call the main method
        String[] args = new String[0];
        App.main(args);

        // Verify the output
        assertEquals("Hello, Cobertura!\n", outContent.toString());
    }

    @Test
    void testMainMethodWithArguments() {
        // Test with some command line arguments
        String[] args = {"arg1", "arg2"};
        App.main(args);

        // Verify the output is the same regardless of arguments
        assertEquals("Hello, Cobertura!\n", outContent.toString());
    }
}