package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    void testMainPrintsMessage() {
        // Given
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String expectedOutput = "Hello, Cobertura!\n";

        // When
        App.main(null);
        String actualOutput = outputStream.toString();

        // Then
        assertEquals(expectedOutput, actualOutput);
    }
}