package com.simplesjavaexercises.documentation.poo.exercise3;

import java.util.Arrays;

public class Exercise3 {

  public static void main(String[] args) {
    System.out.println(exercise1());
    System.out.println(exercise2());
    System.out.println(exercise3());
    System.out.println(exercise4());
    System.out.println(exercise5());
    System.out.println(exercise6());
    System.out.println(exercise7());
  }


  private static int exercise1() {
    int[] age = new int[4];

    age[0] = 25;
    age[1] = 30;
    age[2] = 22;
    age[3] = 8;

    return age[1];
  }

  private static String exercise2() {
    String[] cities = {"São Paulo", "Rio de Janeiro", "Belo Horizonte", "Curitiba",};

    return cities[2];
  }

  private static int exercise3() {
    double[] temperatures = {23.5, 28.1, 19.0, 32.7, 25.3};

    return temperatures.length;
  }

  private static String exercise4() {
    String[][] names = {
        {"Nome", "Sobrenome"},
        {"Carlos", "Eduardo", "Paludetto"}
    };

    return names[0][0] + ": " + names[1][0];
  }

  private static String exercise5() {
    int[] origin = {10, 20, 30, 40, 50, 60, 70};
    int[] destiny = new int[4];

    System.arraycopy(origin, 2, destiny, 0, 4);

    return Arrays.toString(destiny);
  }

  private static Object exercise6() {
    String[] coffee = {
        "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",
        "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",
        "Marocchino", "Ristretto"};

    String[] selectedCoffee = Arrays.copyOfRange(coffee, 2, 7);

    return Arrays.toString(selectedCoffee);
  }

  private static Object exercise7() {
    boolean[] status = new boolean[3];

    Arrays.fill(status, true);

    return Arrays.toString(status);
  }

}
