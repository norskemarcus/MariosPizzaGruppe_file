package com.company;

import java.time.LocalTime;
import java.util.ArrayList;

public class CustomerOrder implements Comparable<CustomerOrder> {
  private ArrayList<Pizza> pizzas;
  private LocalTime pickupTime;
  private String customerName;

  public CustomerOrder (String customerName){
    this.customerName = customerName;
    pizzas = new ArrayList<>();
  }

  public CustomerOrder (String customerName, LocalTime pickupTime){
    this.customerName = customerName;
    this.pickupTime = pickupTime;
  }

  public void addPizza(Pizza pizza, int quantity){
    for (int i = 0 ; i < quantity; i++) {
      pizzas.add(pizza);
    }
  }

  // Slette denne metode og bruge setPixckUpTime i stedet?
  public void addPickUpTime(Pizza orderedPizza, LocalTime pickUpTime) {

    for (int i = 0; i < pizzas.size() ; i++) {
      pizzas.add(orderedPizza, pickUpTime); // ???
    }
  }




  public ArrayList<Pizza> getPizzas() {
    return pizzas;
  }

  public LocalTime getPickupTime() {
    return pickupTime;
  }

  public void setPickupTime(LocalTime pickupTime) {
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
    return pickupTime - o.pickupTime; // hvad skal denne metoden @Daniel?
  }



}
