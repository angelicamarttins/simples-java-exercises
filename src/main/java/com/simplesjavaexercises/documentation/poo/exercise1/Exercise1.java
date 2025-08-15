package com.simplesjavaexercises.documentation.poo.exercise1;

public class Exercise1 {
  public static void main(String[] args) {
    Chair chair = new Chair();
    chair.setTranslation(10L);
    chair.setHeight(1L);
    chair.setSlope(25L);
    chair.printChair();

    Bycicle bycicle = new Bycicle();
    bycicle.turnOn();
    bycicle.accelerate(10L);
    bycicle.brake(2L);
    bycicle.changeGear(2L);
    bycicle.displayStatus();
    bycicle.turnOff();
    bycicle.displayStatus();

    BMWBycicle bmwBycicle = new BMWBycicle();
    bmwBycicle.setModel("XJ");
    bmwBycicle.turnOn();
    bmwBycicle.changeGear(3L);
    bmwBycicle.displayStatus();
    bmwBycicle.isDocumentationOk();
  }
}
