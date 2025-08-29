package com.simplesjavaexercises.documentation.poo.exercise6;

class ExampleClass {
  public ExampleClass() {
    // Usando x no construtor, mesmo que venha depois na declaração
    x = 55;
    System.out.println("Construtor: x = " + x);
  }

  // Declaração do campo vem depois do construtor
  private static int x;

  static {
    System.out.println("static");
  }

  {
    System.out.println("não static");
  }

//  private int initializeX() {
//    System.out.println("Inicializando x");
//    return 42;
//  }

  public static void main(String[] args) throws ClassNotFoundException {
    Class.forName("com.simplesjavaexercises.documentation.poo.exercise6.ExampleClass");

    new ExampleClass();
  }
}
