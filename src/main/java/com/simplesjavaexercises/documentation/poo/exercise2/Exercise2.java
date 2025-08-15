package com.simplesjavaexercises.documentation.poo.exercise2;

public class Exercise2 {

  public static void main(String[] args) {
    Product product = new Product();
    product.setName("TV");
    product.setPrice(2000.00);
    product.setStock(3);
    product.displayInfo();

    Product product1 = new Product();
    product1.setName("Celular");
    product1.setPrice(3000.00);
    product1.setStock(300);
    product1.applyDiscount(100.00);
    product1.displayInfo();

    System.out.println("FEE TAX = " + Product.FEE_TAX_DEFAULT);
  }

}
