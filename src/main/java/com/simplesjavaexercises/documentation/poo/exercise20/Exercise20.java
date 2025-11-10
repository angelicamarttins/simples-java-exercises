package com.simplesjavaexercises.documentation.poo.exercise20;

public class Exercise20 {

  public static void main(String[] args) {
    Person person = new Person("Angélica");
    Person student = new Student();
    Person student1 = new Student("Mayara", "Leticia");

    System.out.println("Person " + person);
    System.out.println("Student " + student);
    System.out.println("Student1 " + student1);
  }

}
