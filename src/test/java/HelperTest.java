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
    void testSubtract_NormalFlow() {
        int result = helper.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    void testSubtract_ZeroResult() {
        int result = helper.subtract(10, 10);
        assertEquals(0, result);
    }

    @Test
    void testSubtract_NegativeResult() {
        int result = helper.subtract(5, 10);
        assertEquals(-5, result);
    }

    @Test
    void testSubtract_MaxIntResult() {
        int result = helper.subtract(Integer.MAX_VALUE, 1);
        assertEquals(Integer.MAX_VALUE - 1, result);
    }

    @Test
    void testSubtract_MinIntResult() {
        int result = helper.subtract(Integer.MIN_VALUE, 1);
        assertEquals(Integer.MIN_VALUE + 1, result);
    }

    @Test
    void testSubtract_LargeNumbersResult() {
        int result = helper.subtract(1000000, 999999);
        assertEquals(1, result);
    }

    @Test
    void testSubtract_NegativeLargeNumbersResult() {
        int result = helper.subtract(-1000000, -999999);
        assertEquals(-1, result);
    }

    @Test
    void testSubtract_NegativePositiveNumbersResult() {
        int result = helper.subtract(-1000000, 999999);
        assertEquals(-1999999, result);
    }

    @Test
    void testSubtract_PositiveNegativeNumbersResult() {
        int result = helper.subtract(1000000, -999999);
        assertEquals(1999999, result);
    }

    @Test
    void testSubtract_MinIntOverflow() {
        assertThrows(ArithmeticException.class, () -> {
            helper.subtract(Integer.MIN_VALUE, 1);
        });
    }
}