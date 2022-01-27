package com.company;

public class FlowerBed implements TerritoryDecoration {


    private Flowers typeOfFlowers;
    private int number;


    @Override
    public int hashCode() {
        return typeOfFlowers.hashCode() * 101 + number;
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
        if (typeOfFlowers != other.typeOfFlowers)
            return false;
        if (number != other.number)
            return false;
        return true;
    }



    public FlowerBed(Flowers flowers, int number){
        this.typeOfFlowers = flowers;
        this.number = number;
    }


    public void beDamaged(CanRun canRun, String description){
        System.out.println("The flowerbed was"+ description + "  damaged");
    }



    public void beRippedOut(WayToBeRippedOut wayToBeRippedOut, FromWhatToBeRippedOut fromWhatToBeRippedOut, CanRun canRun){
        String nameOfFlowers = "";
        String fromWhat = "";
        String howTo = "";
        String nameOfBadCreature = canRun.toString();
        String side = "";
        if (Math.random() > 0.5){
            side = "left";
        }
        else {
            side = "right";
        }

        switch (this.typeOfFlowers){
            case DAISY:
                nameOfFlowers = "Daisies";
                break;
            case CHAMOMILE:
                nameOfFlowers = "Chamomiles";
                break;
            case TULIP:
                nameOfFlowers = "Tulips";
                break;
            case PANSY:
                nameOfFlowers = "Pansies";
                break;
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


        System.out.println(nameOfFlowers + " " + howTo + " fly away " + fromWhat + " to the " + side );

    }



}
