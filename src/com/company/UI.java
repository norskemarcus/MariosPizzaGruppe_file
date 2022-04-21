package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class UI {

  Pizza pizza1 = new Pizza(1, "Vesuvio", "tomatsauce, ost, skinke og oregano",57);
  Pizza pizza2 = new Pizza(2, "Amerikaner", "tomatsauce, ost, oksefars og oregano", 53);
  Pizza pizza3 = new Pizza (3, "Cacciatore", "tomatsauce, ost, pepperoni og oregano", 57);
  // Pizza pizza4 = new Pizza (4, "Carbona", )

  public void orderingScene(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to Marios Pizza!");
    System.out.println("Please state your name!: ");
    sc.nextLine();

  }
  public void addPizzaToArray (){
    ArrayList<Pizza> pizzas = new ArrayList<>();
    pizzas.add(pizza1);
    pizzas.add(pizza2);

 CustomerOrder order1 = new CustomerOrder("Ferhat", 1800,pizzas);
    CustomerOrder order2 = new CustomerOrder("Marcus", 1900,pizzas);
    CustomerOrder order3 = new CustomerOrder("Daniel", 1700,pizzas);

    order1.getPickupTime();

    ArrayList<CustomerOrder> orderList = new ArrayList<>();
    orderList.add(order1);
    orderList.add(order2);
    orderList.add(order3);
    System.out.println(orderList);


  }


}
