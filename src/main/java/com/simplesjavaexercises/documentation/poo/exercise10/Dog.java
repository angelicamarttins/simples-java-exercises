package com.simplesjavaexercises.documentation.poo.exercise10;

public class Dog {

    private String name;
    private int age;
    private static int numberOfDogs;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        numberOfDogs += 1;
    }

    public void bark() {
        System.out.println(this.name);
    }

    public static int getNumberOfDogs() {
        return numberOfDogs;
    }

}
