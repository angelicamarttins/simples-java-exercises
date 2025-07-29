package com.simplesjavaexercises.testing;

public class Calculator {

  public static double average(int[] numbers) {
    int sum = 0;
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

