package com.simplesjavaexercises.documentation.poo.exercise19;

public interface OperateCar {
  default void startEngine() {
    System.out.println("Starting engine in interface OperateCar");
  }
}
