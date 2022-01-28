package com.company;

import java.util.Objects;

public class Dog implements Runnable {


    protected String name;
    private double speed;
    private boolean chain;
    private double distanceTravelled;
    private double damage;
    private String appearance;
    private double potentialSpeed;


    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speed, chain, distanceTravelled, damage, appearance, potentialSpeed);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Dog other = (Dog) obj;
        if (!Objects.equals(potentialSpeed, other.potentialSpeed))
            return false;
        if (!Objects.equals(name, other.name))
            return false;
        return true;
    }



    public void untieTheChain(Shorty shorty) {
        this.chain = false;
        this.speed = this.potentialSpeed;
        System.out.println(shorty.name + " untie the " + this + "'s chain");
    }


    public Dog(String name, double speed, boolean chain, double damage, double potentialSpeed, String appearance) {
        this.name = name;
        this.chain = chain;
        if (speed >= 0){
            this.speed = speed;
        }
        else {
            throw new WrongSpeedInputException("Speed must be positive");
        }
        this.damage = damage;
        this.potentialSpeed = potentialSpeed;
        this.appearance = appearance;
    }

    public double getDamage(){
        return this.damage;
    }

    public void damageTheFlowerBed(FlowerBed flowerBed, WayToBeRippedOut wayToBeRippedOut, FromWhatToBeRippedOut fromWhatToBeRippedOut){
        flowerBed.beRippedOut(wayToBeRippedOut, fromWhatToBeRippedOut, this);
    }

    public void toRunAroundTheHome(Home home){
        int countOfFlowerBeds = home.getSizeOfEnvironment();
        int numberInArray = (int) (Math.random()*countOfFlowerBeds);
        FlowerBed flowerBed = (FlowerBed) home.getFlowerBedElement(numberInArray);
        this.damageTheFlowerBed(flowerBed, WayToBeRippedOut.WITH_ROOT, FromWhatToBeRippedOut.FROM_LEGS);
    }


    public void toRun() {
        this.distanceTravelled += this.speed*0.5;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }


    public void toBite(Pursuer canBeAPursuer) throws ShortyCannotDieException {
        canBeAPursuer.getHurtByPurpose(this.damage);
        System.out.println(this + " bite the " + canBeAPursuer);

    }

    public void toRunOnStrawberryField(StrawberryGardens strawberryGardens, double preoccupationWithTheSituation){
        if (preoccupationWithTheSituation >=10){
            System.out.println(this + " rushes without looking at the road");
            strawberryGardens.beDamaged(this, "Ruthlessly");
        }
        else{
            System.out.println(this + " gently jumps over all the strawberries");
        }

    }


}
