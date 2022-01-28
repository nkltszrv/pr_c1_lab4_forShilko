package com.company;

import java.util.Objects;

public class FlowerBed implements TerritoryDecoration {


    private Flowers typeOfFlowers;
    private int number;
    private String nameOfTwoOrMoreFlowers;


    @Override
    public int hashCode() {
        return Objects.hash(typeOfFlowers, number, nameOfTwoOrMoreFlowers);
    }

    @Override
    public String toString(){
        return "Flower bed with " + this.typeOfFlowers + 's';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FlowerBed other = (FlowerBed) obj;
        if (!Objects.equals(typeOfFlowers, other.typeOfFlowers))
            return false;
        if (!Objects.equals(number, other.number))
            return false;
        return true;
    }



    public FlowerBed(Flowers flowers, int number){
        this.typeOfFlowers = flowers;
        this.number = number;
        switch (this.typeOfFlowers){
            case DAISY:
                nameOfTwoOrMoreFlowers = "Daisies";
                break;
            case CHAMOMILE:
                nameOfTwoOrMoreFlowers = "Chamomiles";
                break;
            case TULIP:
                nameOfTwoOrMoreFlowers = "Tulips";
                break;
            case PANSY:
                nameOfTwoOrMoreFlowers = "Pansies";
                break;
        }
    }


    public void beDamaged(Runnable runnable, String description){
        System.out.println("The flowerbed was"+ description + "  damaged");
    }



    public void beRippedOut(WayToBeRippedOut wayToBeRippedOut, FromWhatToBeRippedOut fromWhatToBeRippedOut, Runnable runnable){
        String nameOfTwoOrMoreFlowers = "";
        String fromWhat = "";
        String howTo = "";
        String nameOfBadCreature = runnable.toString();
        String side = "";
        if (Math.random() > 0.5){
            side = "left";
        }
        else {
            side = "right";
        }


        switch (wayToBeRippedOut){
            case WITH_ROOT:
                howTo = "with roots";
                break;
            case WITHOUT_ROOT:
                howTo = "without roots";
                break;
        }


        switch (fromWhatToBeRippedOut){
            case FROM_HANDS:
                fromWhat = "from under the " + nameOfBadCreature + "'s hands";
                break;
            case FROM_LEGS:
                howTo = "from under the " + nameOfBadCreature +"'s feet";
                break;
        }


        System.out.println(this.nameOfTwoOrMoreFlowers+ " " + howTo + " fly away " + fromWhat + " to the " + side );

    }



}
