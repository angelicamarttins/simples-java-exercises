package com.simplesjavaexercises.documentation.poo.exercise7;

public class Exercise7 {

  public static void main(String[] args) {
    int value = 10;
    Book book = new Book();

    System.out.println("Value before modifyPrimitive = " + value);
    modifyPrimitive(value);
    System.out.println("Value after modifyPrimitive = " + value);

    System.out.println("---------------------------------");

    System.out.println("Book before modifyReference = " + book.getTitle() + " " + book.getPages());
    modifyReference(book);
    System.out.println("Value after modifyReference = " + book.getTitle() + " " + book.getPages());

    System.out.println("---------------------------------");

    showAllAuthors(book.getAuthors());

    System.out.println("---------------------------------");

    String[] authors = {"Immanuel Kant", "René Descartes"};
    showAllAuthors(authors);

    System.out.println("---------------------------------");

    showAllAuthors("Sócrates", "Platão", "Aristóteles");

    System.out.println("---------------CAR------------------");

    Car car = new Car();
    car.setMake("A");
    car.setModel("B");
    car.setYear(2025);

    System.out.println(car.getMake());
    System.out.println(car.getModel());
    System.out.println(car.getYear());
  }

  public static void modifyPrimitive(int p) {
    p = 13;
  }

  public static void modifyReference(Book b) {
    b.setTitle("Any title");
    b.setPages(1234);

    String[] authors = {"Clarice Lispector", "Cecília Meireles"};
    b.setAuthors(authors);
  }

  public static void showAllAuthors(String... authors) {
    for (var author : authors) {
      System.out.println(author);
    }
  }

}
