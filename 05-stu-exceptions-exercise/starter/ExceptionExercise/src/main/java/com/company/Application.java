package com.company;

import java.io.FileNotFoundException;

public class Application {

    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("Current saved animals file:");
        Pets.readPetsFromFile();

        int petIndex = Pets.choosePet();

        String chosenPet = Pets.retrievePet(petIndex);

        Pets.writePetToFile(chosenPet);

        System.out.println("New saved animals file:");
        Pets.readPetsFromFile();

    }
}
