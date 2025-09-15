package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

public class UnusedClassTest {
    private UnusedClass unusedClass;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private final PrintStream standardOut = System.out;

    @BeforeEach
    public void setUp() {
        unusedClass = new UnusedClass();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void testUnusedMethod_PrintsExpectedMessage() {
        // When
        unusedClass.unusedMethod();

        // Then
        assertEquals("This method is not covered by tests.", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }
}