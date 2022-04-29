package com.company;

public class Calculator {

    public int divide(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        } else {
            return num1/num2;
        }
    }

}
