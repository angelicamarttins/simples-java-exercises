package com.simplesjavaexercises.documentation.poo.exercise15;

import java.lang.Math.*;
import java.util.Arrays;

import static java.lang.Math.random;

public class Exercise15 {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(generateRandomRange()));
    System.out.println("-----------------");

    System.out.println(Arrays.toString(generateRandomRange()));
    System.out.println("-----------------");

    System.out.println(Arrays.toString(generateRandomRange()));
    System.out.println("-----------------");
  }

  private static int[] generateRandomRange() {
    int a = (int) (random() * 100);
    int b = (int) (random() * 100);

    return Arrays.stream(new int[]{a, b}).sorted().toArray();
  }

}
