package com.company;

import java.time.LocalTime;
import java.util.ArrayList;

public class CustomerOrder {
  private ArrayList<Pizza> pizzas;
  private LocalTime pickupTime;
  private String customerName;
  private int orderNumber;
  private static int lastOrderNumber = 0;


  public CustomerOrder(String customerName) {
    this.customerName = customerName;
    pizzas = new ArrayList<>();
    orderNumber = lastOrderNumber + 1;
    lastOrderNumber = orderNumber;
  }


  public void addPizza(Pizza pizza, int quantity) {
    for (int i = 0; i < quantity; i++) {
       pizzas.add(pizza);
    }
  }


  public int getOrderNumber() {
    return orderNumber;
  }


  public LocalTime getPickupTime1() {
    return pickupTime;
  }

  public void setPickupTime(LocalTime pickupTime) {
    this.pickupTime = pickupTime;
  }

  @Override
  public String toString() {
    String s =
        "\n\n" + "Kundenummer: " + getOrderNumber() + "\n" + "Kundenavn: "  + customerName + "\n" +
            "Ordre afhentes kl. " + pickupTime + "\n" +
            "Bestilt:\n";


    for (Pizza pizza : pizzas) {
      s += pizza.getNumber() + ". " + pizza.getName() + " " + pizza.getPrice() + " kr.\n";
    }
    return s +  "Total: " + sumOrders() + " kr\n";
  }

  public int sumOrders(){

    int sum = 0;
    for (Pizza pizza : pizzas) {
      sum += pizza.getPrice();
    }
    return sum;
  }
}
