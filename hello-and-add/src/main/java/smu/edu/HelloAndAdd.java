package smu.edu;

import java.util.Scanner;

public class HelloAndAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = sc.nextLine();

        System.out.println("Hello, " + name);

        System.out.println("Please enter a number.");
        int numberOne = sc.nextInt();

        System.out.println("Please enter another number");
        int numberTwo = sc.nextInt();

        int sum = numberOne + numberTwo;
        System.out.println("The sum of those numbers is " + sum);
    }


}
