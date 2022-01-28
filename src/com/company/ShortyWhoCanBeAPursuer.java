package com.company;


public class ShortyWhoCanBeAPursuer extends Shorty implements Pursuer {

    private double potentialSpeed;
    private double hp;
    private double distanceToThePurpose;
    private double speed;
    private double preoccupationWithTheSituation;
    private double timeOfRunning = 0;

    public ShortyWhoCanBeAPursuer(String name, double speed, double distanceToThePurpose, double potentialSpeed, double hp, double preoccupationWithTheSituation){
        super(name);
        if (speed >= 0){
            this.speed = speed;
        }
        else {
            throw new WrongSpeedInputException("Speed must be positive");
        }
        this.name = name;
        this.distanceToThePurpose = distanceToThePurpose;
        this.potentialSpeed = potentialSpeed;
        this.hp = hp;
    }

    public double getPotentialSpeed(){
        return this.potentialSpeed;
    }

    public void setSpeed(double speed){
        this.speed = speed;
    }


    public double getPreoccupationWithTheSituation(){
        return this.preoccupationWithTheSituation;
    }

    public void setPreoccupationWithTheSituation(double preoccupationWithTheSituation){
        this.preoccupationWithTheSituation = preoccupationWithTheSituation;
    }


    public double getTimeOfRunning() {
        return this.timeOfRunning;
    }
    public void  setTimeOfRunning(double timeOfRunning){this.timeOfRunning = timeOfRunning;}



    public double getSpeed() {
        return this.speed;
    }


    public void getHurtByPurpose(double damage) throws ShortyCannotDieException {
        if (this.hp - damage >= Parameter.getMinHp()) {
            this.preoccupationWithTheSituation += 1;
            this.hp -= damage;
            System.out.println(this + " lost " + damage + " hp");
        } else {
            this.hp = Parameter.getMinHp();
            this.preoccupationWithTheSituation += 1;
            System.out.println(this + " lost all his hp, but he had alive \nHis new hp = " + Parameter.getMinHp() );
            throw new ShortyCannotDieException("It is the story for kids. No one can die.");
        }
    }


    public void toThrowYourselfFromTheHill() throws ShortyCannotDieException{
        System.out.println(this + " throw himself from the hill");
        if (this.hp - 4 >= Parameter.getMinHp()) {
            this.hp -= 4;
            System.out.println(this + " get 4 damage");
        }
        else{
            this.hp = Parameter.getMinHp();
            throw new ShortyCannotDieException("It is the story for kids. No one can die.");
        }
    }



    public void toCheckTheDistanceToThePurpose(Purpose purpose){
        if (this.distanceToThePurpose <= 4){
            TurnAside turnAside = new TurnAside();
            turnAside.doReception(this, purpose);
        }

    }


    public double getDistanceToThePurpose(){
        return this.distanceToThePurpose;
    }


    public void setDistanceToThePurpose(double distanceToThePurpose) {
        this.distanceToThePurpose = distanceToThePurpose;
    }


}