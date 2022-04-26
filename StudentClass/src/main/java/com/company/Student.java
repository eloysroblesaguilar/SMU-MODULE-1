package com.company;

public class Student {
    private String name;
    private double gpa;

    public void greet(){
        System.out.println("Hello, I am " + name + " and I have a " + gpa + " GPA.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
