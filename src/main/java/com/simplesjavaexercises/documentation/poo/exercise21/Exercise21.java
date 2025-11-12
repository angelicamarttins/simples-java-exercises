package com.simplesjavaexercises.documentation.poo.exercise21;

public class Exercise21 {

  public static void main(String[] args) {
    Animal animal = new Animal(2);
    Animal animalClone = animal.clone();

    System.out.println("Animal = " + animal.getAge());
    System.out.println("Animal Clone = " + animalClone.getAge());

    System.out.println("-------------------------------");

    animal.setAge(3);

    System.out.println("Animal = " + animal.getAge());
    System.out.println("Animal Clone = " + animalClone.getAge());

    System.out.println("-------------------------------");

    animalClone.setAge(4);

    System.out.println("Animal = " + animal.getAge());
    System.out.println("Animal Clone = " + animalClone.getAge());
  }

}
