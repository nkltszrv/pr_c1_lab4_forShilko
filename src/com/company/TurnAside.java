package com.company;

public class TurnAside implements Reception {

    public void doReception(CanBeAPursuer canBeAPursuer, CanBeAPurpose canBeAPurpose){
        double distance = canBeAPursuer.getDistanceToThePurpose();
        double shortySpeed= canBeAPursuer.getSpeed();
        distance += shortySpeed*2;
        canBeAPursuer.setDistanceToThePurpose(distance);
        canBeAPurpose.setDistanceToThePursuer(distance);
        String dogName = canBeAPurpose.toString();
        String shortyName = canBeAPursuer.toString();
        System.out.println(shortyName + " turned sharply to the side");
        System.out.println(dogName + "  slipped through");
        System.out.println("New distance between pursuer and purpose: " + distance);
    }


}
