package com.ocp_se8_programmer_II_study_guide._4;
// Functional Programming Using Streams
// Using Variables in Lambdas

/**
 * This is a custom functional interface, not a built-in one.
 * Abstract method move takes no param, and returns a String.
 */
public interface Gorilla { String move(); } // Functional interface, defines the Gorilla type


class GorillaFamily {
    String walk = "walk"; // instance variable

    // first method
    void everyonePlay(boolean baby) { // effectively final method parameter, takes only a boolean
        // only calls method play(), which takes a Gorilla fi type

        String approach = "amble"; // effectively final local variable
        // approach = "run"; // would cause a compiler error, because would stop being effectively final

        // first walk
        play(() -> walk); // each lambda provides the implementation of the abstract method move() in the fi Gorilla
        // then run
        play(() -> baby ? "hitch a ride" : "run"); // accesses the effectively final method param baby
        // finally approach
        play(() -> approach); // taking no arg, it returns a String, accessing effectively final local variable approach
    }

    // second method
    void play(Gorilla g) { // takes a Gorilla type
        System.out.println(g.move());
    }

}