package com.ocp_se8_programmer_II_study_guide._4;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

class ReturningOptional {
  public static void main(String... args) {

    BinaryOperator<Integer> op = (a, b) -> a * b;

    Stream<Integer> empty = Stream.empty();
    Stream<Integer> oneElement = Stream.of(3);
    Stream<Integer> threeElements = Stream.of(3,5,6);

    empty.reduce(op).ifPresent(System.out::println); // no output
    oneElement.reduce(op).ifPresent(System.out::println); // 3
    threeElements.reduce(op).ifPresent(System.out::println); // 90

  }
}
