package com.company;
import java.util.TimerTask;

public class PurposeDogPart2TimerTask extends TimerTask{

    private final DogWhoCanBeAPurpose dogWhoCanBeAPurpose;
    private final ShortyWhoCanBeAPursuer shortyWhoCanBeAPursuer;

    public PurposeDogPart2TimerTask(DogWhoCanBeAPurpose dogWhoCanBeAPurpose, ShortyWhoCanBeAPursuer shortyWhoCanBeAPursuer) {
        this.dogWhoCanBeAPurpose = dogWhoCanBeAPurpose;
        this.shortyWhoCanBeAPursuer = shortyWhoCanBeAPursuer;
    }


    public void run(){
        try {
            this.dogWhoCanBeAPurpose.runForOrCatchingUp(this.shortyWhoCanBeAPursuer);

        } catch (ShortyCannotDieException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }









}

