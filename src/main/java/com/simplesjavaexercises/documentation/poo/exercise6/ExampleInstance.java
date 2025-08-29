package com.simplesjavaexercises.documentation.poo.exercise6;

class ExampleInstance {
  public ExampleInstance() {
    // Usando x no construtor, mesmo que venha depois na declaração
    System.out.println("Construtor: x = " + x);
  }

  // Declaração do campo vem depois do construtor
  private int x = 10;

//  private int initializeX() {
//    System.out.println("Inicializando x");
//    return 42;
//  }

  public static void main(String[] args) {
    new ExampleInstance();
  }
}
