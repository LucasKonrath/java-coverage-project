package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class UnusedClassTest {
    private UnusedClass unusedClass;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        unusedClass = new UnusedClass();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testUnusedMethod_PrintsExpectedMessage() {
        // When
        unusedClass.unusedMethod();

        // Then
        assertEquals("This method is not covered by tests.\n", outContent.toString());
    }
}