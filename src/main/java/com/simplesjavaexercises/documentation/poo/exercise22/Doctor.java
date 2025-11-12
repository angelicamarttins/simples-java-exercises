package com.simplesjavaexercises.documentation.poo.exercise22;

public class Doctor extends AbstractPerson {

  private String degree;

  public Doctor(String name, String degree) {
    super(name);
    this.degree = degree;
  }

  public String getDegree() {
    return degree;
  }

  public void setDegree(String degree) {
    this.degree = degree;
  }

  @Override
  public void printPerson() {
    AbstractPerson.printStaticMessage();
    super.printMessage();
    System.out.println("I'm a doctor and also a person.");
  }
}
