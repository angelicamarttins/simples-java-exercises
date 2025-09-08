package com.simplesjavaexercises.documentation.poo.exercise8;

public class Exercise8 {
    public static void main(String[] args) {
        Product product1 = new Product();
        Product product2 = new Product("TV", 3000.00);
        Product product3 = new Product("Tablet", 2000.00, 23);

        System.out.println("Product1 " + product1);
        System.out.println("Product2 " + product2);
        System.out.println("Product3 " + product3);

        product1 = null;
    }
}
