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
    void testAddPositiveNumbers() {
        assertEquals(5, helper.add(2, 3), "Should correctly add two positive numbers");
    }

    @Test
    void testAddWithZero() {
        assertEquals(7, helper.add(7, 0), "Should correctly handle addition with zero");
        assertEquals(7, helper.add(0, 7), "Should correctly handle addition with zero");
    }

    @Test
    void testAddNegativeNumbers() {
        assertEquals(-5, helper.add(-2, -3), "Should correctly add two negative numbers");
    }

    @Test
    void testAddMaxValues() {
        assertEquals(Integer.MAX_VALUE + 1L, (long)helper.add(Integer.MAX_VALUE, 1), "Should handle maximum integer values");
    }

    @Test
    void testSubtractPositiveNumbers() {
        assertEquals(2, helper.subtract(5, 3), "Should correctly subtract two positive numbers");
    }

    @Test
    void testSubtractWithZero() {
        assertEquals(7, helper.subtract(7, 0), "Should correctly handle subtraction with zero");
        assertEquals(-7, helper.subtract(0, 7), "Should correctly handle subtraction from zero");
    }

    @Test
    void testSubtractNegativeNumbers() {
        assertEquals(1, helper.subtract(-2, -3), "Should correctly subtract two negative numbers");
    }
}