package com.simplesjavaexercises.documentation.poo.exercise17;

public class Exercise17 {

  public static void main(String[] args) {
    StringBuilder stringBuilder = new StringBuilder("Hello");

    System.out.println("StringBuilder = " + stringBuilder);
    System.out.println("Length = " + stringBuilder.length());
    System.out.println("Capacity = " + stringBuilder.capacity());

    stringBuilder.append(3.14);
    System.out.println("StringBuilder after append double = " + stringBuilder);

    stringBuilder.append(true);
    System.out.println("StringBuilder after append true = " + stringBuilder);

    StringBuilder stringBuilder1 = new StringBuilder("Java bom!");
    System.out.println("StringBuilder = " + stringBuilder1);

    stringBuilder1.insert(4, " é");
    System.out.println("StringBuilder after insert = " + stringBuilder1);

    int lastChar = stringBuilder1.length() - 1;
    stringBuilder1.deleteCharAt(lastChar);
    System.out.println("StringBuilder after deleteCharAt = " + stringBuilder1);

    stringBuilder1.delete(0, 4);
    System.out.println("StringBuilder after delete = " + stringBuilder1);

    StringBuilder stringBuilder2 = new StringBuilder("Socorram me subi no onibus em Marrocos");
    System.out.println("StringBuilder = " + stringBuilder2);

    stringBuilder2.reverse();
    System.out.println("StringBuilder after reverse = " + stringBuilder2);
  }

}
