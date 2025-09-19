package com.simplesjavaexercises.documentation.poo.exercise13;

public class Main {

  public static void main(String[] args) {
    var record = new RecordExample(3, 1);
    System.out.println(record);
    System.out.println("a " + record.a());
    System.out.println("b " + record.b());
    record.printMessage("Message from an instance record");

    RecordExample.printMessageStatic("Message from record");
  }

}
