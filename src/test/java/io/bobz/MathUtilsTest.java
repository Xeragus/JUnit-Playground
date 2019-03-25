package io.bobz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("When running MathUtils")
class MathUtilsTest {
    MathUtils mathUtils;

    @BeforeEach
    void init() {
        mathUtils = new MathUtils();
    }

    @Nested
    @DisplayName("add method")
    class AddTest {
        @Test
        @DisplayName("when adding two positive numbers")
        void testAddPositive() {
            assertEquals(3, mathUtils.add(1, 2), "should return the right sum");
        }

        @Test
        @DisplayName("when adding two negative numbers")
        void testAddNegative() {
            assertEquals(-3, mathUtils.add(-2, -1), "should return the right sum");
        }
    }

    @Test
    void testComputeCircleArea() {
        double radius = 10;
        double expected = Math.PI * radius * radius;

        assertEquals(expected, mathUtils.computeCircleArea(radius), "The computeCircleArea method returns the area of a circle for a given radius");
    }

    @Test
    void testDivide() {
        int a = 10;
        int b = 5;
        double expected = a / b;

        assertThrows(ArithmeticException.class, () -> mathUtils.divide(a, 0), "The divide method throws an exception on division with 0");
        assertEquals(expected, mathUtils.divide(a, b), "The divide method returns the division of two numbers");
    }

    @Test
    @DisplayName("Testing multiply method")
    void testMultiply() {
        assertAll(
                () -> assertEquals(6, mathUtils.multiply(3,2)),
                () -> assertEquals(-3, mathUtils.multiply(-3, 1)),
                () -> assertEquals(0, mathUtils.multiply(6, 0))
        );
    }
}