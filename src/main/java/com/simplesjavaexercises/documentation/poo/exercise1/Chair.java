package com.simplesjavaexercises.documentation.poo.exercise1;

public class Chair {

  private Long height;
  private Long slope;
  private Long translation;

  public void setHeight(Long height) {
    this.height = height;
  }

  public void setSlope(Long slope) {
    this.slope = slope;
  }

  public void setTranslation(Long translation) {
    this.translation = translation;
  }

  public void printChair() {
    System.out.printf("Height = %d. Slope = %d. Translation = %d\n", height, slope, translation);
  }
}
