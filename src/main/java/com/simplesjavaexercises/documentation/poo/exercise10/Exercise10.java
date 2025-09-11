package com.simplesjavaexercises.documentation.poo.exercise10;

public class Exercise10 {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Beethoven", 13);
        Dog dog2 = new Dog("Mozart", 14);
        Dog dog3 = new Dog("Vivaldi", 15);
        Dog dog4 = new Dog("Bach", 16);
        Dog dog5 = new Dog("Chopin", 17);

        dog1.bark();
        dog2.bark();
        dog3.bark();
        dog4.bark();
        dog5.bark();

        System.out.println(Dog.getNumberOfDogs());
    }

}
