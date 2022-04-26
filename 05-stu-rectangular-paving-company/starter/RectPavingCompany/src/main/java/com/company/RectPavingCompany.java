package com.company;

import java.util.Scanner;

public class RectPavingCompany {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the width of your driveway in feet?");
        int width = Integer.parseInt(sc.nextLine());
        System.out.println("What is the length of your driveway in feet?");
        int length = Integer.parseInt(sc.nextLine());

        int perimeter = (width * 2) + (length * 2);
        int area = width * length;

        System.out.println("The perimeter of the driveway is " + perimeter);
        System.out.println("The area of the driveway is " + area);

        System.out.println("How much does the cement cost in dollars per square foot?");
        int cement = Integer.parseInt(sc.nextLine());
        System.out.println("How much does the framing cost in dollars per linear foot");
        int framing = Integer.parseInt(sc.nextLine());

        double costOfCement = area * cement;
        double costOfFrame = perimeter * framing;

        System.out.println("The subtotal cost of the cement is " + costOfCement);
        System.out.println("The subtotal cost of the framing is " + costOfFrame);
    }
}
