package com.company;

import java.util.Scanner;

public class PrimeFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number!");
        int stop = Integer.parseInt(sc.nextLine());

        boolean prime = false;
        for (int k = 1; k <= stop; k++ ){
            for (int j = 1; j <= k/2; j++) {
                if (k % j == 0){
                    prime = true;
                }
            }

                System.out.println(i + " is a prime number."

        }


    }
}
