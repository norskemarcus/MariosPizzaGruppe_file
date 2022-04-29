package com.company;

public class Pizza {

  private int number;
  private String name;
  private String description;
  private int price;


  public Pizza(int number, String name, String description, int price) {
    this.number = number;
    this.name = name;
    this.price = price;
    this.description = description;
  }


  public String getName() {
    return name;
  }

  public int getNumber() {
    return number;
  }

  public int getPrice() {
    return price;
  }

  public String getDescription() {
    return description;
  }

  @Override
  public String toString() {
    return
        number + ". " + name+ ": "+ description +" "+ price + " kr.";
  }


}
