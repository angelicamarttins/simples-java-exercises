package com.simplesjavaexercises.documentation.poo.exercise4;

public class Exercise4 {

  public static void main(String[] args) {
    var condition = true;
    int i;

    System.out.println(condition ? method1() : method2());

    i = 0;
    System.out.println("i = " + i);
  }

  private static Object method1() {
    return "true";
  }

  private static Object method2() {
    return "false";
  }

}
