package com.company;

import java.util.Timer;
import java.util.TimerTask;

public class Case extends Situation {

    private Timer timer;

    @Override
    public String toString() {
        return "case lol";
    }


    public void toTakeAnUnwantedTurn(DogWhoCanBeAPurpose dogWhoCanBeAPurpose1, DogWhoCanBeAPurpose dogWhoCanBeAPurpose2, ShortyWhoCanBeAPursuer shortyWhoCanBeAPursuer, Home home, Shorty shorty1, Shorty shorty2, StrawberryGardens strawberryGardens){
        System.out.println("The case had take an unwanted turn");
        shorty1.untieTheDogChain(dogWhoCanBeAPurpose1);
        shorty2.untieShortyWhoCanBeAPursuerHands(shortyWhoCanBeAPursuer);
        this.setTimer(dogWhoCanBeAPurpose1, dogWhoCanBeAPurpose2, shortyWhoCanBeAPursuer, home, strawberryGardens);

    }


    public Case(long timeToStart){
        this.timeToStart = timeToStart;
    }


    public void setTimer(DogWhoCanBeAPurpose dogWhoCanBeAPurpose1, DogWhoCanBeAPurpose dogWhoCanBeAPurpose2, ShortyWhoCanBeAPursuer shortyWhoCanBeAPursuer, Home home, StrawberryGardens strawberryGardens) {
        TimerTask timerTaskDog = new PurposeDogTimerTask(dogWhoCanBeAPurpose1, shortyWhoCanBeAPursuer);
        TimerTask timerTaskShorty = new PursuerShortyTimerTask(dogWhoCanBeAPurpose1, shortyWhoCanBeAPursuer, home);
        TimerTask timerTaskDogPart2n1 = new PurposeDogPart2TimerTask(dogWhoCanBeAPurpose1, shortyWhoCanBeAPursuer);
        TimerTask timerTaskShortyPart2 = new PursuerShortyPart2TimerTask(dogWhoCanBeAPurpose1, dogWhoCanBeAPurpose2, shortyWhoCanBeAPursuer, strawberryGardens);
        TimerTask timerTaskDogPart2n2 = new PurposeDogPart2TimerTask(dogWhoCanBeAPurpose2, shortyWhoCanBeAPursuer);
        TimerTask timerTaskReinforcement = new ReinforcementArrivesTimerTask(shortyWhoCanBeAPursuer);

        Timer timer1 = new Timer();
        this.timer = timer1;
        Timer timer2 = new Timer();
        this.timer = timer2;
        timer1.schedule(timerTaskDog, this.timeToStart, 500);
        timer2.schedule(timerTaskShorty, this.timeToStart,  500);

        Timer timer3 = new Timer();
        Timer timer4 = new Timer();
        Timer timer5 = new Timer();
        timer3.schedule(timerTaskShortyPart2, 60010, 500);
        timer4.schedule(timerTaskDogPart2n2, 60030,  500);
        timer5.schedule(timerTaskDogPart2n1, 60030, 500);

        Timer timer6 = new Timer();
        timer6.schedule(timerTaskReinforcement, 60000);

    }



}
