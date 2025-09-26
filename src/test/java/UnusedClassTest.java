package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UnusedClassTest {
    private UnusedClass unusedClass;

    @BeforeEach
    void setUp() {
        unusedClass = new UnusedClass();
    }

    @Test
    void testUnusedMethod() {
        // Given
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String expectedOutput = "This method is not covered by tests.\n";

        // When
        unusedClass.unusedMethod();
        String actualOutput = outContent.toString();

        // Then
        assertEquals(expectedOutput, actualOutput);
    }
}