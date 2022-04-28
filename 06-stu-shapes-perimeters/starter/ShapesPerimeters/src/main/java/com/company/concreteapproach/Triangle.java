package com.company.concreteapproach;

public class Triangle extends Shape{
    ///assuming this is an equilateral triangle

    private int side;

    public float area(int side){
        return (float) (Math.sqrt(3)/4 * Math.pow(side, 2));
    }

    public int perimeter(int side ){
        return side * 3;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
