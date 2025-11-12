package com.simplesjavaexercises.documentation.poo.exercise21;

public class Animal implements Cloneable {

  private int age;

  public Animal() {}

  public Animal(int age) {
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public Animal clone() {
    try {
      Animal clone = (Animal) super.clone();
      clone.setAge(this.age);
      return clone;
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }
}
