package com.company;

public class HomeApplication {
    public static void main(String[] args) {
        Home home = new Home();
        Room bedroom = new Room(10.0f, 5.0f, 2.0f, 10.0f, "tile");
        Room kitchen = new Room(10.0f, 5.0f, 2.0f, 10.0f, "tile");
        Room bathroom = new Room(10.0f, 5.0f, 2.0f, 10.0f, "tile");
        Room basement = new Room(10.0f, 5.0f, 2.0f, 10.0f, "tile");
        Room patio = new Room(10.0f, 5.0f, 2.0f, 10.0f, "tile");
        home.setBasement(basement);
        home.setBathroom(bathroom);
        home.setBedroom(bedroom);
        home.setKitchen(kitchen);
        home.setPatio(patio);
        System.out.println(home);
        System.out.println(home.getBasement());
    }

}
