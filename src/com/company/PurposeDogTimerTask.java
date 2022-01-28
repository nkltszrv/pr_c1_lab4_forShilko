package com.company;

import java.util.TimerTask;

public class PurposeDogTimerTask extends TimerTask {

    private final CanBeAPurpose canBeAPurpose;
    private final CanBeAPursuer canBeAPursuer;


    public PurposeDogTimerTask(DogWhoCanBeAPurpose dogWhoCanBeAPurpose, ShortyWhoCanBeAPursuer shortyWhoCanBeAPursuer) {
        this.canBeAPurpose = dogWhoCanBeAPurpose;
        this.canBeAPursuer = shortyWhoCanBeAPursuer;
    }



    public void run(){
        try {
            this.canBeAPurpose.runForOrCatchingUp(this.canBeAPursuer);

        } catch (ShortyCannotDieException e) {
            e.printStackTrace();
        }

        this.canBeAPurpose.setTimeOfRunning(this.canBeAPurpose.getTimeOfRunning() + 0.5);

        if (this.canBeAPurpose.getTimeOfRunning() == 60){
            this.cancel();
        }

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        }









}
