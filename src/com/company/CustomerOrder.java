package com.company;

import java.time.LocalTime;
import java.util.ArrayList;

public class CustomerOrder implements Comparable<CustomerOrder> {
  private ArrayList<Pizza> pizzas;
  private LocalTime pickupTime;
  private String customerName;


  public CustomerOrder(String customerName) {
    this.customerName = customerName;
    pizzas = new ArrayList<>();
  }
//TODO: Slette hvis man kan bruge setPickUpTime i stedet
  public CustomerOrder(String customerName, LocalTime pickupTime) {
    this.customerName = customerName;
    this.pickupTime = pickupTime;
  }

  public void addPizza(Pizza pizza, int quantity) {
    for (int i = 0; i < quantity; i++) {
      pizzas.add(pizza);
    }
  }

  /* Slette denne metode og bruge setPickUpTime i stedet?
  public void addPickUpTime(CustomerOrder order, LocalTime pickUpTime) {

    for (int i = 0; i < pizzas.size() ; i++) {
      order.add(order, pickUpTime); // skal kobles til ordren
    }
  }
   */


  public ArrayList<Pizza> getPizzas() {
    for (int i = 0; i < pizzas.size(); i++) {
      System.out.println(pizzas.get(i));
    }
    return pizzas;
  }


  public void printPizzas(){

    for (int i = 0; i < pizzas.size(); i++) {
      System.out.println(pizzas.get(i));
    }
  }

  public LocalTime getPickupTime(long minutes) { // Forsøg med antal minutter efter nuværende tidspunkt
    pickupTime = pickupTime.plusMinutes(minutes);
    return pickupTime;
  }

  public void setPickupTime(LocalTime pickupTime) {
    this.pickupTime = pickupTime;
  }

  @Override
  public String toString() {
    String s =
        "\n\n" + "Kundenavn: "  + customerName + "\n" +
            "Ordre afhentes kl. " + pickupTime + "\n" +
            "Bestilt:\n";
        ArrayList<Pizza> tempPizza = getPizzas();

    for (int i = 0; i < tempPizza.size(); i++) {
      s += "No. " + tempPizza.get(i).getNumber() + ". " + tempPizza.get(i).getName() + " " + tempPizza.get(i).getPrice() + " kr.\n";

    }
    return s;
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
