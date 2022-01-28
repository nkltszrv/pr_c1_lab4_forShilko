package com.company;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        ShortyWhoCanBeAPursuer Neznaika = new ShortyWhoCanBeAPursuer("Neznaika", 0, 10, 5, 100, 10);
        DogWhoCanBeAPurpose Milordick = new DogWhoCanBeAPurpose("Milordick", 0, true, 10, 10, 6, "", 10);
        DogWhoCanBeAPurpose ProstoPsina = new DogWhoCanBeAPurpose("Unnowable", 10, true, 10, 10, 6, "lean, tailless, long ears, thin bony paws, short brown coat", 10);
        Shorty Feks = new Shorty("Feks", 1, 1);
        Shorty Fiks = new Shorty("Fiks", 1, 1);


        FlowerBed flowerBedWithTulips = new FlowerBed(Flowers.TULIP, 1);
        FlowerBed flowerBedWithChamomiles = new FlowerBed(Flowers.CHAMOMILE, 2);
        FlowerBed flowerBedWithDaisies = new FlowerBed(Flowers.DAISY, 3);
        FlowerBed flowerBedWithPansies = new FlowerBed(Flowers.PANSY, 4);

        ArrayList<FlowerBed> environment = new ArrayList<>();
        Home home = new Home(4, environment);
        home.addFlowerBedToTheEnvironment(flowerBedWithChamomiles);
        home.addFlowerBedToTheEnvironment(flowerBedWithDaisies);
        home.addFlowerBedToTheEnvironment(flowerBedWithPansies);
        home.addFlowerBedToTheEnvironment(flowerBedWithTulips);

        StrawberryGardens strawberryGardens = new StrawberryGardens();

        Case case1 = new Case(0);


        case1.toTakeAnUnwantedTurn(Milordick, ProstoPsina, Neznaika, home, Feks, Fiks, strawberryGardens);

    }
}
