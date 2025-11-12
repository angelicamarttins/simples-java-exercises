package com.simplesjavaexercises.documentation.poo.exercise22;

public abstract class AbstractPerson {

  private String name;

  public AbstractPerson(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public abstract void printPerson();

  public void printMessage() {
    System.out.println("I'm a person.");
  }

  public static void printStaticMessage() {
    System.out.println("I'm a static person.");
  }
}
