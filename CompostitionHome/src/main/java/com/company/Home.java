package com.company;

public class Home {

    private Room bedroom;
    private Room kitchen;
    private Room bathroom;
    private Room basement;
    private Room patio;

    public Home(Room bedroom, Room kitchen, Room bathroom, Room basement, Room patio) {
        this.bedroom = bedroom;
        this.kitchen = kitchen;
        this.bathroom = bathroom;
        this.basement = basement;
        this.patio = patio;
    }

    public Home() {
    }

    public Room getBedroom() {
        return bedroom;
    }

    public void setBedroom(Room bedroom) {
        this.bedroom = bedroom;
    }

    public Room getKitchen() {
        return kitchen;
    }

    public void setKitchen(Room kitchen) {
        this.kitchen = kitchen;
    }

    public Room getBathroom() {
        return bathroom;
    }

    public void setBathroom(Room bathroom) {
        this.bathroom = bathroom;
    }

    public Room getBasement() {
        return basement;
    }

    public void setBasement(Room basement) {
        this.basement = basement;
    }

    public Room getPatio() {
        return patio;
    }

    public void setPatio(Room patio) {
        this.patio = patio;
    }

    @Override
    public String toString() {
        return "Home{" +
                "bedroom=" + bedroom +
                ", kitchen=" + kitchen +
                ", bathroom=" + bathroom +
                ", basement=" + basement +
                ", patio=" + patio +
                '}';
    }
}
