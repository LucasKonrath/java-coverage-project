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
        assertEquals(7, helper.add(7, 0), "Adding zero should return the same number");
        assertEquals(7, helper.add(0, 7), "Adding zero should return the same number");
    }
    
    @Test
    void testAddNegativeNumbers() {
        assertEquals(-5, helper.add(-2, -3), "Should correctly add two negative numbers");
    }
    
    @Test
    void testAddPositiveAndNegative() {
        assertEquals(-1, helper.add(2, -3), "Should correctly add positive and negative numbers");
    }
    
    @Test
    void testSubtractPositiveNumbers() {
        assertEquals(2, helper.subtract(5, 3), "Should correctly subtract two positive numbers");
    }
    
    @Test
    void testSubtractWithZero() {
        assertEquals(7, helper.subtract(7, 0), "Subtracting zero should return the same number");
        assertEquals(-7, helper.subtract(0, 7), "Subtracting from zero should return negative number");
    }
    
    @Test
    void testSubtractNegativeNumbers() {
        assertEquals(1, helper.subtract(-2, -3), "Should correctly subtract two negative numbers");
    }
    
    @Test
    void testSubtractPositiveAndNegative() {
        assertEquals(5, helper.subtract(2, -3), "Should correctly subtract negative from positive");
    }
}