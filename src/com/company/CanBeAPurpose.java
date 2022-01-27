package com.company;

public interface CanBeAPurpose {

    public void runForOrCatchingUp(CanBeAPursuer canBeAPursuer) throws ShortyCannotDieException;
    public void toCatchUp(CanBeAPursuer canBeAPursuer) throws ShortyCannotDieException;
    public double getDistanceToThePursuer();
    public void setDistanceToThePursuer(double distance);
    public void setTimeOfRunning(double timeOfRunning);
    public double getTimeOfRunning();

}
