package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        int expected = 4;
        int actual = new Calculator().add(2,2);
        assertEquals(expected,actual);
    }

    @Test
    void testAdd() {
        int expected = 6;
        int actual = new Calculator().add(2,2,2);
        assertEquals(expected,actual);
    }

    @Test
    void subtract() {
        int expected = 8;
        int actual = new Calculator().subtract(10,2);
        assertEquals(expected,actual);
    }

    @Test
    void multiply() {
        int expected = 22;
        int actual = new Calculator().multiply(11,2);
        assertEquals(expected,actual);
    }

    @Test
    void divide() {
        int expected = 2;
        int actual = new Calculator().divide(4,2);
        assertEquals(expected,actual);

        int expected2 = 0;
        int actual2 = new Calculator().divide(1,2);
        assertEquals(expected2,actual2);
    }
}