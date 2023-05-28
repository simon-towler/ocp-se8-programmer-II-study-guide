package com.ocp_se8_programmer_II_study_guide._4;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

class ReductionWithCombiner {
  public static void main(String... args) {
    BinaryOperator<Integer> op = (a, b) -> a * b;
    Stream<Integer> stream = Stream.of(3, 5, 6);
    System.out.println(stream.reduce(1, op, op)); // 90
  }
}
