package com.simplesjavaexercises.documentation.poo.exercise13;

public record RecordExample(int a, int b) {

  static {
    System.out.println("Static initializer within a record");
  }

  private static final int anyValue = 13;
  private static int otherValue;

  public RecordExample {
    if (a > 2) a = 2;

    if (b < 2) b = anyValue;
  }

  @Override
  public String toString() {
    return "Override toString with static value: " + anyValue + " Other value: " + otherValue;
  }

  public void printMessage(String message) {
    System.out.println(message);
  }

  public static void printMessageStatic(String message) {
    System.out.println(message);
  }

}
