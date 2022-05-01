package com.company;

import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayFunTest {

    ArrayFun arrayFun;
    List<List<Integer>> listOfArrays;
    @Before
    public void setUp(){
        listOfArrays = new ArrayList<>();

        List<Integer> firstint = new ArrayList<>();
        firstint.add(1);
        firstint.add(2);
        firstint.add(3);

        List<Integer> secondint = new ArrayList<>();
        secondint.add(4);
        secondint.add(4);
        secondint.add(4);

        List<Integer> thirdint = new ArrayList<>();
        thirdint.add(2);
        thirdint.add(4);
        thirdint.add(6);

        listOfArrays.add(firstint);
        listOfArrays.add(secondint);
        listOfArrays.add(thirdint);

//        int[][] arrayOfArrays =  { {1,2,3} , {4, 4, 4}, {2, 4, 6} };
        arrayFun = new ArrayFun();

    }

    @Test
    public void shouldReturnAverageOfArrays(){
        List<Integer> actualResult = arrayFun.averagesArrays(listOfArrays);
        List<Integer> expectedResult = new ArrayList<>();
        expectedResult.add(2);
        expectedResult.add(4);
        expectedResult.add(4);

        assertEquals(expectedResult, actualResult);
    }

}