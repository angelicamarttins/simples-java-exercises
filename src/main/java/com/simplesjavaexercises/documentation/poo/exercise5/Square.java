package com.simplesjavaexercises.documentation.poo.exercise5;

public class Square extends Point implements Area {

  public int height;
  private int width;

  public Square() {
  }

  public Square(int height, int width) {
    this.height = height;
    this.width = width;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getWidth() {
    return width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  @Override
  public String anyMethod() {
    return "I'm a method return";
  }
}
