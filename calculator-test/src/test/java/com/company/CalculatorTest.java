package com.company;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calc;

    @Before
    public void setup(){
        calc = new Calculator();
    }

    @Test
    public void shouldDivideTwoPositiveIntegers(){
        int actualResult = calc.divide(6,3);
        int expectedResult = 2;
        assertEquals(expectedResult, actualResult);

        assertEquals(2, calc.divide(10,5));
    }

    @Test
    public void shouldDivideTwoNegativeIntegers(){
        int actualResult = calc.divide(-6, -3);
        int expectedResult = 2;
        assertEquals(expectedResult,actualResult);

        assertEquals(2, calc.divide(-10,-5));
    }

    @Test
    public void shouldDivideOnePositiveAndOneNegativeNumber(){
        int actualResult = calc.divide(-6, 3);
        int expectedResult = -2;
        assertEquals(expectedResult, actualResult);

        assertEquals(-2, calc.divide(-10, 5));
    }

    @Test
    public void shouldReturnZeroIfNumeratorOrDenominatorIsZero(){
        int actualResult = calc.divide(10, 0);
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);

        assertEquals(0, calc.divide(0, 10));
    }


}
