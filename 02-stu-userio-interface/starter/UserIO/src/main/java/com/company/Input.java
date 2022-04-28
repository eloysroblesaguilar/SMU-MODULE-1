package com.company;

import com.company.interfaces.UserIO;

import java.util.Scanner;

public class Input implements UserIO {

    private Scanner scanner = new Scanner(System.in);

    public int readInt(String prompt) {
        System.out.println(prompt);
        return Integer.parseInt(scanner.nextLine());
    }

    public long readLong(String prompt) {
        System.out.println(prompt);
        return Long.parseLong(scanner.nextLine());
    }

    public double readDouble(String prompt) {
        System.out.println(prompt);
        return Double.parseDouble(scanner.nextLine());
    }

    public float readFloat(String prompt) {
        System.out.println(prompt);
        return Float.parseFloat(scanner.nextLine());
    }

    public String readString(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }
}
