package com.simplesjavaexercises.documentation.poo.exercise8;

public class Product {

    private String name;
    private double price;
    private int quantity;

    public Product() {
        this.name = "Unknown";
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 1;
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int sum(int a, int b) {
        return a + b;
    }
// Compilation error
//    public long sum(int a, int b) {
//        return (long) a + (long) b;
//    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
