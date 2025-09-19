package com.simplesjavaexercises.documentation.poo.exercise13;

public record RecordExample(int a, int b) {

  static {
    System.out.println("Static initializer within a record");
  }

  private static final int anyValue = 1;
  private static int otherValue;

  @Override
  public String toString() {
    return "Override toString with static value: " + anyValue + " Other value: " + otherValue;
  }

}
