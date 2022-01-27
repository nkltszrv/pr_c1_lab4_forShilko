package com.company;

public interface CanBeAPursuer {

    public void toCheckTheDistanceToThePurpose(CanBeAPurpose canBeAPurpose);
    public double getDistanceToThePurpose();
    public void setDistanceToThePurpose(double distanceToThePurpose);
    public double getSpeed();
    public void getHurtByPurpose(double damage) throws ShortyCannotDieException, ShortyCannotDieException;
}
