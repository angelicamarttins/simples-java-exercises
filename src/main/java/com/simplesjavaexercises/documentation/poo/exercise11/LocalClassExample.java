package com.simplesjavaexercises.documentation.poo.exercise11;

public class LocalClassExample {

  private String name;

  public void testing() {
    class ClassTest {
      String name;

      ClassTest() {
        this.name = "Default constructor";
      }

      ClassTest(String name) {
        this.name = name;
      }

      public void showName() {
        System.out.println("Name this.name " + this.name);
        System.out.println("Name just name " + name);
        System.out.println("Name LocalClassExample.this.name " + LocalClassExample.this.name);
      }
    }

    var classTest1 = new ClassTest();
    var classTest2 = new ClassTest("Custom constructor");

    classTest1.showName();
    classTest2.showName();
  }

}
