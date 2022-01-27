package com.company;

import java.util.TimerTask;


public class ReinforcementArrivesTimerTask extends TimerTask {

    private final ShortyWhoCanBeAPursuer shortyWhoCanBeAPursuer;

    public ReinforcementArrivesTimerTask(ShortyWhoCanBeAPursuer shortyWhoCanBeAPursuer){
        this.shortyWhoCanBeAPursuer = shortyWhoCanBeAPursuer;
    }

    @Override
    public void run() {
        Reinforcement fixWithDog = new Reinforcement() {
            @Override
            public void toArrive() {
                System.out.println("Reinforcement has arrived!");
                System.out.println(shortyWhoCanBeAPursuer + " noticed the reinforcement");
            }
        };

        fixWithDog.toArrive();
        try {
            shortyWhoCanBeAPursuer.toThrowYourselfFromTheHill();
        } catch (ShortyCannotDieException e) {
            System.out.println(shortyWhoCanBeAPursuer + " has died. It is very sad");
        }

    }



}
