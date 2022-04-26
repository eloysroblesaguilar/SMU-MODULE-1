package com.company;

public class App {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        student1.setName("Bob");
        student1.setGpa(3.5);
        student2.setName("Rob");
        student2.setGpa(4.0);

        student1.greet();
        student2.greet();
    }
}
