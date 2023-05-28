package com.ocp_se8_programmer_II_study_guide._4;

import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Set;

class ConcatStrings {
   public static void main(String... args) {
     Stream<String> stream = Stream.of("w", "o", "l", "f");

     // leveraging Collectors interface, without determining order
     Set<String> set = stream.collect(Collectors.toSet());
     System.out.println(set); // [f, w, l, o]
   }

}
