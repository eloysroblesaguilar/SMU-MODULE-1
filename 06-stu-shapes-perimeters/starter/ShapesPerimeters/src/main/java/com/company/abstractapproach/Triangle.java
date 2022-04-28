package com.company.abstractapproach;

public class Triangle extends Shape{
    private int side;

    public Triangle(int side) {
        this.side = side;
    }

    public Triangle() {
    }

    @Override
    public float area(int side) {
        return (float) (Math.sqrt(3)/4 * Math.pow(side, 2));
    }

    @Override
    public float perimeter(int side) {
        return side * 3;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
