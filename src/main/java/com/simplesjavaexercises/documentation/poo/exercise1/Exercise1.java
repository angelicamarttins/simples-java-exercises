package com.simplesjavaexercises.documentation.poo.exercise1;

public class Exercise1 {
  public static void main(String[] args) {
    Chair chair = new Chair();
    chair.setTranslation(10L);
    chair.setHeight(1L);
    chair.setSlope(25L);
    chair.printChair();

    Bycicle bycicle = new Bycicle();
    bycicle.displayStatus();
  }
}
