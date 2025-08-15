package com.simplesjavaexercises.documentation.poo.exercise1;

import java.util.Objects;

public class BMWBycicle extends Bycicle {

  private String model;

  @Override
  public void changeGear(Long newGear) {
    super.changeGear(newGear);
  }

  @Override
  public void displayStatus() {
    super.displayStatus();
    System.out.println("Model = " + model);
    System.out.println("Documentation = " + isDocumentationOk());
  }

  @Override
  public boolean isDocumentationOk() {
    return Objects.nonNull(model);
  }

  public void setModel(String model) {
    this.model = model;
  }

}
