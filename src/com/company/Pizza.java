package com.company;

public class Pizza {

  private int number;
  private String name;
  private String ingrediens1;
  private String ingrediens2;
  private String ingrediens3;
  private String ingrediens4;
  private String ingrediens5;
  private String ingrediens6;
  private String ingrediens7;
  private int price;

  public Pizza(int number, String name, String ingrediens1, String ingrediens2, String ingrediens3, String ingrediens4, int price) {
    this.name = name;
    this.ingrediens1 = ingrediens1;
    this.ingrediens2 = ingrediens2;
    this.ingrediens3 = ingrediens3;
    this.ingrediens4 = ingrediens4;
    this.price = price;
  }

  public Pizza(int number, String name, String ingrediens1, String ingrediens2, String ingrediens3, String ingrediens4, String ingrediens5, int price) {
    this.name = name;
    this.ingrediens1 = ingrediens1;
    this.ingrediens2 = ingrediens2;
    this.ingrediens3 = ingrediens3;
    this.ingrediens4 = ingrediens4;
    this.ingrediens5 = ingrediens5;
    this.price = price;
  }

  public Pizza(int number, String name, String ingrediens1, String ingrediens2, String ingrediens3, String ingrediens4, String ingrediens5, String ingrediens6, int price) {
    this.name = name;
    this.ingrediens1 = ingrediens1;
    this.ingrediens2 = ingrediens2;
    this.ingrediens3 = ingrediens3;
    this.ingrediens4 = ingrediens4;
    this.ingrediens5 = ingrediens5;
    this.ingrediens6 = ingrediens6;
    this.price = price;
  }

  public Pizza(int number, String name, String ingrediens1, String ingrediens2, String ingrediens3, String ingrediens4, String ingrediens5, String ingrediens6, String ingrediens7, int price) {
    this.name = name;
    this.ingrediens1 = ingrediens1;
    this.ingrediens2 = ingrediens2;
    this.ingrediens3 = ingrediens3;
    this.ingrediens4 = ingrediens4;
    this.ingrediens5 = ingrediens5;
    this.ingrediens6 = ingrediens6;
    this.ingrediens7 = ingrediens7;
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
