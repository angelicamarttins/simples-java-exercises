package com.simplesjavaexercises.documentation.poo.exercise20;

public class Student extends Person {
  private String lastName;

  public Student() {
  }

  public Student(String lastName) {
    this.lastName = lastName;
  }

  public Student(String name, String lastName) {
    super(name);
    this.lastName = lastName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    System.out.println("Person super" + super.toString());
    return "Student{" +
        "lastName='" + lastName + '\'' +
        '}';
  }
}
