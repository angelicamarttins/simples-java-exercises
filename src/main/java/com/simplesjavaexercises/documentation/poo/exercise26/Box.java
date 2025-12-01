package com.simplesjavaexercises.documentation.poo.exercise26;

public class Box<T extends Integer> {

  private T number;

  public Box(T number) {
    this.number = number;
    showInnerMember();
  }

  private void showInnerMember() {
    System.out.println(number);
  }

  public static <U> void showBox(U box) {
    System.out.println(box);
  }

  public static <U extends Float> void showBox(U box) {
    System.out.println(box);
  }

}
