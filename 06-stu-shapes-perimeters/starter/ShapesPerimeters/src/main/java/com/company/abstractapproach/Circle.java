package com.company.abstractapproach;



public class Circle extends Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public float area(int radius) {
        return (float) Math.pow((Math.PI * radius), 2);

    }

    @Override
    public float perimeter(int radius) {
        return (float) (2*Math.PI*radius);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
