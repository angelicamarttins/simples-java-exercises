package com.simplesjavaexercises.documentation.poo.exercise25;

public class Dog {

  public static void main(String[] args) {
    Dog dog = new Dog();

    Dog.staticMethod("Beethoven");
    dog.instanceMethod("Mozart");
    System.out.println(Dog.staticMethodReturn("Amadeus"));
    System.out.println(dog.instanceMethodReturn("Vivaldi", 135));
  }

  public static <T> void staticMethod(String name) {
    System.out.println(name);
  }

  public static <T> T staticMethodReturn(T name) {
    return name;
  }

  public <T> void instanceMethod(String name) {
    System.out.println(name);
  }

  public <T> T instanceMethodReturn(T name, int age) {
    System.out.println(age);
    return name;
  }

}
