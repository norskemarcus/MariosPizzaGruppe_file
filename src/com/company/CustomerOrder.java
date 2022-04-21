package com.company;

import java.util.ArrayList;

public class CustomerOrder {
  private ArrayList<Pizza> pizzas;
  private int pickupTime;
  private String customerName;

  public CustomerOrder (String customerName, int pickupTime, ArrayList pizzas){
    this.customerName = customerName;
    this.pickupTime = pickupTime;
    this.pizzas = pizzas;
  }

  @Override
  public String toString() {
    return
        pickupTime+" = pickupTime\n" +
        customerName + " = customerName\n" +
            "PIZZAS:\n " + pizzas;
  }
}
