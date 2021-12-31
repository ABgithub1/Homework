package by.academy.homework7.Ex3;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void sum() {
        System.out.println("@testMathSum");
        assertEquals(4, Calculator.sum(2, 2));
    }

    @Test
    public void minus() {
        System.out.println("@TestMinus");
        assertEquals(3, Calculator.minus(5, 2));
    }

    @Test
    public void division() {
        System.out.println("divisionTest");
        assertEquals(5, Calculator.division(25, 5));
    }
}