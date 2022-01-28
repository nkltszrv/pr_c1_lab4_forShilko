package com.company;

import java.util.Objects;

public class StrawberryGardens implements TerritoryDecoration{

    String description;

    public void beDamaged(Runnable runnable, String description){
        System.out.println(runnable.toString() + " " + description + " trampled on the strawberry");
    }

    @Override
    public int hashCode() {
        return description.hashCode();
    }

    @Override
    public String toString(){
        return "Strawberry gardens";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        StrawberryGardens other = (StrawberryGardens) obj;
        if (!Objects.equals(description, other.description))
            return false;
        return true;
    }


}
