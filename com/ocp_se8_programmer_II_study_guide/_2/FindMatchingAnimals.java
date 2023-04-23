package com.ocp_se8_programmer_II_study_guide._2;

import java.util.function.Predicate;
public class FindMatchingAnimals {
    private static void print(Animal animal, Predicate<Animal> trait) {
        if(trait.test(animal)) System.out.println(animal);
    }

    public static void main(String[] args) {
        print(new Animal("fish", false, true), Animal::canHop);
        print(new Animal("kangaroo", true, false), Animal::canHop);
    }

}