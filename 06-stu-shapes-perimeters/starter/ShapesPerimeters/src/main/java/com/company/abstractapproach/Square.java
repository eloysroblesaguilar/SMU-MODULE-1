package com.company.abstractapproach;

public class Square extends Shape{
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public Square() {
    }

    @Override
    public float area(int side) {
        return side*side;
    }

    @Override
    public float perimeter(int side) {
        return side * 4;
    }


    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
