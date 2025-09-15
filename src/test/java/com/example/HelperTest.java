package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class HelperTest {
    private Helper helper;

    @BeforeEach
    void setUp() {
        helper = new Helper();
    }

    @Test
    void testSubtractPositiveNumbers() {
        assertEquals(3, helper.subtract(8, 5), "Should correctly subtract two positive numbers");
    }

    @Test
    void testSubtractNegativeNumbers() {
        assertEquals(-3, helper.subtract(-8, -5), "Should correctly subtract two negative numbers");
    }

    @Test
    void testSubtractWithZero() {
        assertEquals(5, helper.subtract(5, 0), "Should correctly subtract zero");
        assertEquals(-5, helper.subtract(0, 5), "Should correctly subtract from zero");
    }

    @Test
    void testSubtractMaxValues() {
        assertEquals(0, helper.subtract(Integer.MAX_VALUE, Integer.MAX_VALUE), "Should handle MAX_VALUE subtraction");
    }

    @Test
    void testSubtractMinValues() {
        assertEquals(0, helper.subtract(Integer.MIN_VALUE, Integer.MIN_VALUE), "Should handle MIN_VALUE subtraction");
    }
}