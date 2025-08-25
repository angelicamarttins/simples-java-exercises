package com.simplesjavaexercises.documentation.poo.exercise5;

public class Exercise5 {

  public static void main(String[] args) {
    String[] fullName = {"Angelica", "Cristiane", "Martins"};
    example(fullName);

    System.out.println("----------------------------------");

    String name = "Angelica";
    String middleName = "Cristiane";
    String lastName = "Martins";
    example(name, middleName, lastName);

    Square square = new Square();
    System.out.println(square.getHeight());
  }

  public static void example(String... args) {
    for (var argument : args) {
      System.out.println("Argument = " + argument);
    }
  }
}
