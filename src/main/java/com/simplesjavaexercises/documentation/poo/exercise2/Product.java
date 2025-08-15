package com.simplesjavaexercises.documentation.poo.exercise2;

public class Product {

  protected static final Double FEE_TAX_DEFAULT = 0.18;
  private String name;
  private Double price;
  private Integer stock;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Integer getStock() {
    return stock;
  }

  public void setStock(Integer stock) {
    this.stock = stock;
  }

  public void applyDiscount(Double discount) {
    price -=  discount;
  }

  public void displayInfo() {
    String initialMessage = "Info about the product:";

    System.out.println(initialMessage);
    System.out.printf("Name: %s%n", name);
    System.out.printf("Price: %2f%n", price);
    System.out.printf("Stock: %d%n", stock);
  }

}
