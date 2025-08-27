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

    System.out.println("----------------------------------");

    Square square = new Square();
    System.out.println(square.getHeight());
    System.out.println(square.height);

    System.out.println("----------------------------------");

    System.out.println(testingReturnMethodSubclass());
    System.out.println(testingReturnMethodInterface().anyMethod());
  }

  public static void example(String... args) {
    for (var argument : args) {
      System.out.println("Argument = " + argument);
    }
  }

  public static void returnWithoutValue() {
    int condition = 3;

    for (int i = 0; i <= condition; i++) {
      if (i == 2) {
        return;
      }
    }
  }

  public static Point testingReturnMethodSubclass() {
    return new Square(10, 10);
  }

  public static Area testingReturnMethodInterface() {
    return new Square(20, 20);
  }

}
