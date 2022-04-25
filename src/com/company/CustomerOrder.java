package com.company;

import java.time.LocalTime;
import java.util.ArrayList;

public class CustomerOrder implements Comparable<CustomerOrder> {
  private ArrayList<Pizza> pizzas;
  private LocalTime pickupTime;
  private String customerName;

  private int orderNumber = 0;
  private static int lastOrderNumber = 0;


  public CustomerOrder(String customerName) {
    this.customerName = customerName;
    pizzas = new ArrayList<>();
    orderNumber = lastOrderNumber + 1;
    lastOrderNumber = orderNumber;
  }

//TODO: Slette hvis man kan bruge setPickUpTime i stedet?
  public CustomerOrder(String customerName, LocalTime pickupTime) {
    this.customerName = customerName;
    this.pickupTime = pickupTime;
  }

  public void addPizza(Pizza pizza, int quantity) {
    for (int i = 0; i < quantity; i++) {
      pizzas.add(pizza); // Hvad med fejlmelding hvis man vælger en pizza som ikke findes?
    }
  }

  /* Slette denne metode og bruge setPickUpTime i stedet?
  public void addPickUpTime(CustomerOrder order, LocalTime pickUpTime) {

    for (int i = 0; i < pizzas.size() ; i++) {
      order.add(order, pickUpTime); // skal kobles til ordren
    }
  }
   */


  public int getOrderNumber() {
    return orderNumber;
  }

  public ArrayList<Pizza> getPizzas() {
    return pizzas;
  }


  public LocalTime getPickupTime(long minutes) {
    pickupTime = pickupTime.plusMinutes(minutes);
    return pickupTime;
  }

  public void setPickupTime(LocalTime pickupTime) {
    this.pickupTime = pickupTime;
  }

  @Override
  public String toString() {
    String s =
        "\n\n" + "Customer number: " + getOrderNumber() + "\n" + " Kundenavn: "  + customerName + "\n" +
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


/*
  @Override
  public compareTo(CustomerOrder o) {
    return pickupTime - o.pickupTime;
  }
 */

  @Override
  public int compareTo(CustomerOrder o) {
    return 0;
  }
}
