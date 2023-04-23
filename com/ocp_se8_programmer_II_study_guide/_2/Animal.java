package com.ocp_se8_programmer_II_study_guide._2;
public class Animal {

    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String speciesName, boolean isHopper, boolean isSwimmer) {
        this.species = speciesName;
        this.canHop = isHopper;
        this.canSwim = isSwimmer;
    }

    public boolean canHop() {
        return this.canHop;
    }

    public boolean canSwim() {
        return this.canSwim();
    }

    @Override
    public String toString() {
        return this.species;
    }

}