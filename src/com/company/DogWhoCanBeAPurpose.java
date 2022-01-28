package com.company;


public class DogWhoCanBeAPurpose extends Dog implements Purpose{

    private double distanceToThePursuer;
    private double preoccupationWithTheSituation;
    private double timeOfRunning = 0;



    public DogWhoCanBeAPurpose(String name, double speed, boolean chain, double damage, double distanceToThePursuer, double potentialSpeed, String appearance, double preoccupationWithTheSituation) {
        super(name,speed, chain, damage, potentialSpeed, appearance);
        this.distanceToThePursuer = distanceToThePursuer;
        this.preoccupationWithTheSituation = preoccupationWithTheSituation;
    }

    public double getDistanceToThePursuer() {
        return this.distanceToThePursuer;
    }

    public double getPreoccupationWithTheSituation(){
        return this.preoccupationWithTheSituation;
    }

    public void setPreoccupationWithTheSituation(double preoccupationWithTheSituation){
        this.preoccupationWithTheSituation = preoccupationWithTheSituation;
    }

    public void setDistanceToThePursuer(double distance){
        this.distanceToThePursuer = distance;
    }

    public double getTimeOfRunning() {
        return this.timeOfRunning;
    }
    public void  setTimeOfRunning(double timeOfRunning){this.timeOfRunning = timeOfRunning;}


    public void runForOrCatchingUp(Pursuer pursuer) throws ShortyCannotDieException {
        double distance2;
        double dogSpeed = this.getSpeed();
        double shortySpeed = pursuer.getSpeed();
        double distance = this.getDistanceToThePursuer();
        distance2 =  distance - (dogSpeed - shortySpeed) * 0.5;
        this.setDistanceToThePursuer(distance2);
        pursuer.setDistanceToThePurpose(distance2);
        if (distance <=0){
            this.toCatchUp(pursuer);
            this.preoccupationWithTheSituation += 1;
        }
        System.out.println("New distance between purpose and pursuer: " + distance);
    }


    public void toCatchUp(Pursuer pursuer ) throws ShortyCannotDieException{
        String shortyName = pursuer.toString();
        System.out.println(this.name + " catch the " + shortyName);
        this.toBite(pursuer);
    }


}