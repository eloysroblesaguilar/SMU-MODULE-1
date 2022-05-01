package com.company;

import java.util.ArrayList;
import java.util.List;

public class ArrayFun {

    public List<Integer> averagesArrays(List<List<Integer>> arrayOfIntegers) {
        List<Integer> averageIntegers = new ArrayList<>();

        for (List<Integer> list: arrayOfIntegers) {
            int sum = 0;
            for (int num : list){
                sum += num;
            }
            int average = sum/list.size();
            averageIntegers.add(average);
        }
        return averageIntegers;
    }
}
