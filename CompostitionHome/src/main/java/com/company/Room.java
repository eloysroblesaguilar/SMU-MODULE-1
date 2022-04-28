package com.company;

public class Room {

    private float squareFootage;
    private float roomLength;
    private float roomWidth;
    private float ceilingHeight;
    private String flooringType;

    public Room(float squareFootage, float roomLength, float roomWidth, float ceilingHeight, String flooringType) {
        this.squareFootage = squareFootage;
        this.roomLength = roomLength;
        this.roomWidth = roomWidth;
        this.ceilingHeight = ceilingHeight;
        this.flooringType = flooringType;
    }

    public Room() {
    }

    public float getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(float squareFootage) {
        this.squareFootage = squareFootage;
    }

    public float getRoomLength() {
        return roomLength;
    }

    public void setRoomLength(float roomLength) {
        this.roomLength = roomLength;
    }

    public float getRoomWidth() {
        return roomWidth;
    }

    public void setRoomWidth(float roomWidth) {
        this.roomWidth = roomWidth;
    }

    public float getCeilingHeight() {
        return ceilingHeight;
    }

    public void setCeilingHeight(float ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
    }

    public String getFlooringType() {
        return flooringType;
    }

    public void setFlooringType(String flooringType) {
        this.flooringType = flooringType;
    }

    @Override
    public String toString() {
        return "Room{" +
                "squareFootage=" + squareFootage +
                ", roomLength=" + roomLength +
                ", roomWidth=" + roomWidth +
                ", ceilingHeight=" + ceilingHeight +
                ", flooringType='" + flooringType + '\'' +
                '}';
    }
}
