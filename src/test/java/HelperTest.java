package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelperTest {
    private Helper helper;

    @BeforeEach
    void setUp() {
        helper = new Helper();
    }

    @Test
    void testAdd() {
        int result = helper.add(3, 4);
        assertEquals(7, result);
    }

    @Test
    void testSubtract() {
        int result = helper.subtract(10, 5);
        assertEquals(5, result);
    }
}