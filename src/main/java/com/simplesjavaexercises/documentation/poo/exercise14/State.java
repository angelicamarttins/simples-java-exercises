package com.simplesjavaexercises.documentation.poo.exercise14;

import java.util.List;

public record State(String name, String capitalCity, List<String> cities) {

  public State {
    cities = List.copyOf(cities);
  }

  public State(String name, String capitalCity) {
    this(name, capitalCity, List.of());
  }

  public State(String name, String capitalCity, String... cities) {
    this(name, capitalCity, List.of(cities));
  }

  @Override
  public String toString() {
    return "State{" +
        "name='" + name + '\'' +
        ", capitalCity='" + capitalCity + '\'' +
        ", cities=" + cities +
        '}';
  }
}
