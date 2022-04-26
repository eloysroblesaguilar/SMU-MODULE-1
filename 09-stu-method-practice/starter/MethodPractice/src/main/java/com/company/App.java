package com.company;

public class App {


	// subtract
    public static int subtract(int a, int b) {
        return a - b;
    }


	// subtractOrZero
    public static int subtractOrZero(int a, int b){
        int sum = subtract(a,b);
        return Math.max(sum, 0);
    }


	// max
    public static int max(int a, int b, int c){
        return Math.max(a, Math.max(b, c));
    }


	// min
    public static int min(int a, int b, int c){
        return Math.min(a, Math.min(b, c));
    }


	// isLarger
    public static boolean isLarger(int a, int b){
        return a > b;
    }



}
