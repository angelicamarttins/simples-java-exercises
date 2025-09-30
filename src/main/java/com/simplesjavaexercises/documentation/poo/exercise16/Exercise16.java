package com.simplesjavaexercises.documentation.poo.exercise16;

import java.util.Arrays;

public class Exercise16 {

  public static void main(String[] args) {
    String num = "" + 2;
    System.out.println(num);
    System.out.println(num.getClass());

    System.out.println("----------------------");

    String fullName = " Angélica Martins ";

    System.out.println(Arrays.toString(fullName.split(" ")));
    System.out.println(Arrays.toString(fullName.split(" ", 1)));
    System.out.println(Arrays.toString(fullName.split(" ", 2)));
    System.out.println(Arrays.toString(fullName.split(" ", 3)));

    System.out.println("----------------------");

    System.out.println(fullName.subSequence(1, 4));
    System.out.println(fullName.substring(1, 4));

    System.out.println("----------------------");

    System.out.println(fullName.trim());

    System.out.println("----------------------");

    System.out.println(fullName.toLowerCase());
    System.out.println(fullName.toUpperCase());
  }

}
