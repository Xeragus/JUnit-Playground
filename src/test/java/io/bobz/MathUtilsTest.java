package io.bobz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
    @Test
    void testAdd() {
        MathUtils mathUtils = new MathUtils();

        assertEquals(3, mathUtils.add(1, 2), "The add method returns the sum of two numbers");
    }

    @Test
    void testComputeCircleArea() {
        MathUtils mathUtils = new MathUtils();
        double radius = 10;
        double expected = Math.PI * radius * radius;

        assertEquals(expected, mathUtils.computeCircleArea(radius), "The computeCircleArea method returns the area of a circle for a given radius");
    }

    @Test
    void testDivide() {
        MathUtils mathUtils = new MathUtils();
        int a = 10;
        int b = 5;
        double expected = a / b;

        assertThrows(ArithmeticException.class, () -> mathUtils.divide(a, 0), "The divide method throws an exception on division with 0");
        assertEquals(expected, mathUtils.divide(a, b), "The divide method returns the division of two numbers");


    }
}