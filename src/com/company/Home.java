package com.company;
import java.util.ArrayList;
import java.util.Objects;

public class Home implements Building{

    private int countOfFlowerBeds;
    private ArrayList<FlowerBed> environment;

    @Override
    public int hashCode() {
        return environment.hashCode() * 101 + countOfFlowerBeds;
    }

    @Override
    public String toString(){
        return "home";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Home other = (Home) obj;
        if (!Objects.equals(countOfFlowerBeds, other.countOfFlowerBeds))
            return false;
        if (!Objects.equals(environment, other.environment))
            return false;
        return true;
    }


    public int getSizeOfEnvironment(){
        return this.environment.size();
    }

    public FlowerBed getFlowerBedElement(int numberInArray){
        return this.environment.get(numberInArray);
    }

    public void addFlowerBedToTheEnvironment(FlowerBed flowerBed){
        this.environment.add(flowerBed);
    }

    public Home(int countOfFlowerBeds, ArrayList<FlowerBed> environment){
        this.environment = environment;
        this.countOfFlowerBeds = countOfFlowerBeds;

    }



}
