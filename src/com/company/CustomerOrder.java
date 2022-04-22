package com.company;

import java.util.ArrayList;

public class CustomerOrder implements Comparable<CustomerOrder> {
  private ArrayList<Pizza> pizzas;
  private int pickupTime;
  private String customerName;

  public CustomerOrder (String customerName){
    this.customerName = customerName;
    pizzas = new ArrayList<>();
  }

  public void addPizza(Pizza pizza, int quantity){

    for (int i = 0 ; i < quantity; i++) {
      pizzas.add(pizza);
    }


    //orderList.sort(CustomerOrder::compareTo); fjernes
    // System.out.println(orderList);
  }


  public CustomerOrder (String customerName, int pickupTime, ArrayList pizzas){
    this.customerName = customerName;
    this.pickupTime = pickupTime;
    this.pizzas = pizzas;
  }

  public ArrayList<Pizza> getPizzas() {
    return pizzas;
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

  @Override
  public int compareTo(CustomerOrder o) {
    return pickupTime - o.pickupTime;
  }
}
