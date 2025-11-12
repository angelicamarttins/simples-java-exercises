package com.simplesjavaexercises.documentation.poo.exercise22;


public class Exercise22 {

  public static void main(String[] args) {
    Doctor doctor = new Doctor("Linus", "No doctor");

    doctor.printMessage();
    doctor.printPerson();
    AbstractPerson.printStaticMessage();
  }

}
