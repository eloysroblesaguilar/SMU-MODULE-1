package com.company.concreteapproach;

public class Square extends Shape{
    private int side;

    public int area(int side){
        return side*side;
    }

    public int perimeter(int side){
        return side * 4;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
