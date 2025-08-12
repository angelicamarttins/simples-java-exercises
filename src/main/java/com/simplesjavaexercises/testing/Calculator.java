package com.simplesjavaexercises.testing;

import java.util.stream.Stream;

public class Calculator {

  public static double average(int[] numbers) {
    int sum = 0;

    Stream.iterate(2, integer -> integer + 1)
        .limit(10)
        .forEach(System.out::println);

    for (int number : numbers) {
      sum += number;

      printSum(sum);
    }

    return (double) sum / numbers.length;
  }

  private static void printSum(int sum) {
    System.out.printf("Sum = %d%n", sum);
  }
}

