package com.company;

import java.util.Objects;

public class Shorty implements Runnable {


    private static final double minHp = 1.0;
    private static final double maxHp = 100.0;
    private double hp;
    private double speed;
    protected String name;
    private double distanceTravelled;
    private double potentialSpeed;


    public static class Parameter {

        public static double getMinHp() {
            return minHp;
        }

        public static double getMAxHp(){
            return maxHp;
        }

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speed, distanceTravelled, hp, potentialSpeed);
    }

    @Override
    public String toString(){
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Shorty other = (Shorty) obj;
        if (!Objects.equals(name, other.name))
            return false;
        return true;
    }

    public double getPotentialSpeed(){
        return this.potentialSpeed;
    }

    public Shorty(String name, double speed, double potentialSpeed){
        this.name = name;
        if ((speed >= 0) & (potentialSpeed >=0)){
            this.speed = speed;
            this.potentialSpeed = potentialSpeed;
        }
        else {
            throw new WrongSpeedInputException("Speed must be positive");
        }
    }

    public Shorty(String name){
        this.name = name;
    }

    public void setHp(double hp){
        this.hp = hp;
    }


    public class Hands{
        private boolean beBound;

        public void setBeBound(boolean yesOrNo){
            this.beBound = yesOrNo;
        }

        public boolean getBeBound(){
            return beBound;
        }
    }

    Hands hands = new Hands();


    public void tieShortyWhoCanBeAPursuerHands(Shorty shorty){
        shorty.speed = 0;
        hands.setBeBound(false);
    }

    public void untieShortyWhoCanBeAPursuerHands(ShortyWhoCanBeAPursuer shortyWhoCanBeAPursuer){
        double speedyy = shortyWhoCanBeAPursuer.getPotentialSpeed();
        shortyWhoCanBeAPursuer.setSpeed(speedyy);
        hands.setBeBound(false);
        System.out.println(this + " untie " + shortyWhoCanBeAPursuer + "'s hands");

    }

    public void getHurt(double damage) throws ShortyCannotDieException{
        if( this.hp - damage >= Parameter.getMinHp()){
            this.hp -= damage;
        }
        else{
            this.hp = Parameter.getMinHp();
            throw new ShortyCannotDieException("It is the story for kids. No one can die.");
        }
        System.out.println(this + ": \"Ouch!\"");
    }



    public double getSpeed(){
        return this.speed;
    }

    public void setSpeed(double speed2){
        if (speed2 >= 0){
            this.speed = speed2;
        }
        else {
            throw new WrongSpeedInputException("Speed must be positive");
        }
    }

    public void untieTheDogChain(Dog dog){
        dog.untieTheChain(this);
    }

    public void toRun(){
        this.distanceTravelled += this.speed*0.5;
    }

    public void damageTheFlowerBed(FlowerBed flowerBed, WayToBeRippedOut wayToBeRippedOut, FromWhatToBeRippedOut fromWhatToBeRippedOut){
        flowerBed.beRippedOut(wayToBeRippedOut, fromWhatToBeRippedOut, this);
    }

    public void toRunAroundTheHome(Home home){
        int countOfFlowerBeds = home.getSizeOfEnvironment();
        int numberInArray = (int) (Math.random()*countOfFlowerBeds);
        FlowerBed flowerBed = home.getFlowerBedElement(numberInArray);
        this.damageTheFlowerBed(flowerBed, WayToBeRippedOut.WITH_ROOT, FromWhatToBeRippedOut.FROM_LEGS);
    }


    public void toRunOnStrawberryField(StrawberryGardens strawberryGardens, double preoccupationWithTheSituation){
        if (preoccupationWithTheSituation >=14){
            System.out.println(this + " rushes without looking at the road");
            strawberryGardens.beDamaged(this, "Ruthlessly");
        }
        else{
            System.out.println(this + " gently jumps over all the strawberries");
        }

    }



}
