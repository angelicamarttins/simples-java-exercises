package com.simplesjavaexercises.documentation.poo.exercise18;

public class Main {
  public static void main(String[] args) {
    Cat myCat = new Cat();
    Animal myAnimal = myCat;
    Animal.testClassMethod();
    myAnimal.testInstanceMethod();
    myAnimal.testClassMethod();
    myCat.testClassMethod();
  }
}
