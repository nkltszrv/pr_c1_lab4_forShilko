package com.company;
import java.util.TimerTask;

public class PursuerShortyPart2TimerTask extends TimerTask{

    private final DogWhoCanBeAPurpose dogWhoCanBeAPurpose1;
    private final DogWhoCanBeAPurpose dogWhoCanBeAPurpose2;
    private final ShortyWhoCanBeAPursuer shortyWhoCanBeAPursuer;
    private final StrawberryGardens strawberryGardens;


    public PursuerShortyPart2TimerTask(DogWhoCanBeAPurpose dogWhoCanBeAPurpose1, DogWhoCanBeAPurpose dogWhoCanBeAPurpose2, ShortyWhoCanBeAPursuer shortyWhoCanBeAPursuer, StrawberryGardens strawberryGardens) {
        this.dogWhoCanBeAPurpose1 = dogWhoCanBeAPurpose1;
        this.dogWhoCanBeAPurpose2 = dogWhoCanBeAPurpose2;
        this.shortyWhoCanBeAPursuer = shortyWhoCanBeAPursuer;
        this.strawberryGardens = strawberryGardens;
    }


    @Override
    public void run(){

        double distance1 = this.dogWhoCanBeAPurpose1.getDistanceToThePursuer();
        double distance2 = this.dogWhoCanBeAPurpose2.getDistanceToThePursuer();
        if (distance1 <= 3){
            TurnAside turnAside = new TurnAside();
            turnAside.doReception(this.shortyWhoCanBeAPursuer, this.dogWhoCanBeAPurpose1);
        }
        if (distance2 <= 3){
            TurnAside turnAside = new TurnAside();
            turnAside.doReception(this.shortyWhoCanBeAPursuer, this.dogWhoCanBeAPurpose2);
        }

        this.shortyWhoCanBeAPursuer.toRunOnStrawberryField(this.strawberryGardens, shortyWhoCanBeAPursuer.getPreoccupationWithTheSituation());
        this.dogWhoCanBeAPurpose1.toRunOnStrawberryField(this.strawberryGardens, dogWhoCanBeAPurpose1.getPreoccupationWithTheSituation());
        this.dogWhoCanBeAPurpose2.toRunOnStrawberryField(this.strawberryGardens, dogWhoCanBeAPurpose2.getPreoccupationWithTheSituation());

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }





}
