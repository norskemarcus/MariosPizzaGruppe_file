package com.company;

public class Pizza {

  private int number;
  private String name;
  private String ingredient1;
  private String ingredient2;
  private String ingredient3;
  private String ingredient4;
  private String ingredient5;
  private String ingredient6;
  private String ingredient7;
  private int price;

  public Pizza(int number, String name, String ingredient1, String ingredient2, String ingredient3, String ingredient4, int price) {
    this.name = name;
    this.ingredient1 = ingredient1;
    this.ingredient2 = ingredient2;
    this.ingredient3 = ingredient3;
    this.ingredient4 = ingredient4;
    this.price = price;
  }

  public Pizza(int number, String name, String ingredient1, String ingredient2, String ingredient3, String ingredient4, String ingredient5, int price) {
    this.name = name;
    this.ingredient1 = ingredient1;
    this.ingredient2 = ingredient2;
    this.ingredient3 = ingredient3;
    this.ingredient4 = ingredient4;
    this.ingredient5 = ingredient5;
    this.price = price;
  }

  public Pizza(int number, String name, String ingredient1, String ingredient2, String ingredient3, String ingredient4, String ingredient5, String ingredient6, int price) {
    this.name = name;
    this.ingredient1 = ingredient1;
    this.ingredient2 = ingredient2;
    this.ingredient3 = ingredient3;
    this.ingredient4 = ingredient4;
    this.ingredient5 = ingredient5;
    this.ingredient6 = ingredient6;
    this.price = price;
  }

  public Pizza(int number, String name, String ingredient1, String ingredient2, String ingredient3, String ingredient4, String ingredient5, String ingredient6, String ingredient7, int price) {
    this.name = name;
    this.ingredient1 = ingredient1;
    this.ingredient2 = ingredient2;
    this.ingredient3 = ingredient3;
    this.ingredient4 = ingredient4;
    this.ingredient5 = ingredient5;
    this.ingredient6 = ingredient6;
    this.ingredient7 = ingredient7;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
