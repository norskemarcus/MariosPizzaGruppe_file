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

  public int getPickupTime() {
    return pickupTime;
  }

  public void setPickupTime(int pickupTime) {
    this.pickupTime = pickupTime;
  }

  @Override
  public String toString() {
    return
        "\n\n"+customerName + " = customerName\n" +
            pickupTime+" = pickupTime\n" +
            "PIZZAS:\n " + pizzas;
  }
}
