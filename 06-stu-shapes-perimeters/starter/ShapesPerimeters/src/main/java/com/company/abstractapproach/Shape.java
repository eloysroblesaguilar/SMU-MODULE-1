package com.company.abstractapproach;

public abstract class Shape {
    private String name;
    private String color;
    private int xCoordinate;
    private int yCoordinate;

    public abstract float area(int side);
    public abstract float perimeter(int side);


}
