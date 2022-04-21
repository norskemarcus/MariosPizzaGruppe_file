package com.company;

import java.util.ArrayList;

public class CustomerOrder {
  private Pizza pizzaName;
  private ArrayList<Pizza> pizzas;
  private int pickupTime;
  private String customerName;

  public CustomerOrder (String customerName, int pickupTime, ArrayList pizzas){
    this.customerName = customerName;
    this.pickupTime = pickupTime;
    this.pizzas = pizzas;
  }
}
