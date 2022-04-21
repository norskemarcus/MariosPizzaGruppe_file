package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class UI {

  Pizza pizza1 = new Pizza(1, "Vesuvio", "Tomatsauce, ost, skinke og oregano",57);
  Pizza pizza2 = new Pizza(2, "Amerikaner", "Tomatsauce, ost, oksefars og oregano", 53);
  Pizza pizza3 = new Pizza (3, "Cacciatore", "Tomatsauce, ost, pepperoni og oregano", 57);
  Pizza pizza4 = new Pizza (4, "Carbona","Tomatsauce, ost, kødsauce, spaghetti, coctailpølser og oregano", 63);
  Pizza pizza5 = new Pizza (5, "Dennis","Tomatsauce, ost, skinke, pepperoni, coctailpølser og oregano", 61);
  Pizza pizza6 = new Pizza (6, "Bertil","Tomatsauce, ost, bacon og oregano", 57);
  Pizza pizza7 = new Pizza (7, "Silvia","Tomatsauce, ost, rød peber, løg, oliven og oregano", 61);
  Pizza pizza8 = new Pizza (8, "Victoria","Tomatsauce, ost, skinke, ananas, champignon, løg og oregano", 61);
  Pizza pizza9 = new Pizza (9, "Toronfo","Tomatsauce, ost, skinke, bacon, kebab, chili og oregano", 61);
  Pizza pizza10 = new Pizza (10, "Capricciosa","Tomatsauce, ost, skinke, champignon og oregano", 61);
  Pizza pizza11 = new Pizza (11, "Hawai","Tomatsauce, ost, skinke, ananas og oregano", 61);
  Pizza pizza12 = new Pizza (12, "Le Blissola","Tomatsauce, ost, skinke, rejer og oregano", 61);
  Pizza pizza13 = new Pizza (13, "Venezia","Tomatsauce, ost, skinke, bacon og oregano", 61);
  Pizza pizza14 = new Pizza (14, "Mafia","Tomatsauce, ost, pepperoni, bacon, løg og oregano", 61);


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

    ArrayList<CustomerOrder> orderList = new ArrayList<>(); // Mario se hele tiden, skal sorteres ud fra pick-up time (loope)
    orderList.add(order1);
    orderList.add(order2);
    orderList.add(order3);
    System.out.println(orderList);


  }


}
