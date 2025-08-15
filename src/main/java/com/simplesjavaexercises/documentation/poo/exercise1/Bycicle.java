package com.simplesjavaexercises.documentation.poo.exercise1;

public class Bycicle implements BycicleDocumentation {
  private Boolean isOn = false;
  private Long speed = 0L;
  private Long gear = 0L;
  private Long fuel = 0L;

  public void turnOn() {
    this.isOn = true;
  }

  public void turnOff() {
    this.speed = 0L;
    this.gear = 0L;
    this.isOn = false;
  }

  public void accelerate(Long increment) {
    this.speed += increment;
  }

  public void brake(Long decrement) {
    if (isOn && speed > 0) {
      this.speed -= decrement;
    }
  }

  public void changeGear(Long newGear) {
    if (isOn) {
      this.gear = newGear;
    }
  }

  public void refuel (Long listers) {
    if (fuel < 100L) {
      fuel += listers;
    }
  }

  public void displayStatus() {
    System.out.printf("Is bycicle on? %b\n", isOn);
    System.out.printf("Current speed %d\n", speed);
    System.out.printf("Current gear %d\n", gear);
    System.out.printf("Current fuel %d\n", fuel);
  }

  @Override
  public boolean isDocumentationOk() {
    return false;
  }
}
