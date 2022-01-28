package com.company;

public class TurnAside implements Reception {


    public void doReception(Pursuer pursuer, Purpose purpose){
        double distance = pursuer.getDistanceToThePurpose();
        double shortySpeed= pursuer.getSpeed();
        distance += shortySpeed*2;
        pursuer.setDistanceToThePurpose(distance);
        purpose.setDistanceToThePursuer(distance);
        String dogName = purpose.toString();
        String shortyName = pursuer.toString();
        System.out.println(shortyName + " turned sharply to the side");
        System.out.println(dogName + "  slipped through");
        System.out.println("New distance between pursuer and purpose: " + distance);
    }
}