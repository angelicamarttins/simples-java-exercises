package com.simplesjavaexercises.documentation.poo.exercise23;

public interface CarRegulator {

  void startEngine();

  default boolean checkFuelLevel() {
    return true;
  }

}
