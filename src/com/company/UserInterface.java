package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

  //private ArrayList<CustomerOrder> orderList = new ArrayList<>(); // samlet ordreliste
  //private ArrayList<Pizza> pizzas = new ArrayList<>(); // kundens pizzaer
  private PizzaMenu pizzaMenu;
  private OrderList orderList;

  public UserInterface(){
    this.pizzaMenu = new PizzaMenu();
    this.orderList = new OrderList();
  }


  public void displayPizzaMenu(){

    pizzaMenu.addPizzaToMenu();

    for (int i = 0; i < pizzaMenu.getPizzaMenu().size(); i++) {

      System.out.println(i);
    }
  }



  public void makeOrder(){

    Scanner sc = new Scanner(System.in);

    System.out.println("Welcome to Marios Pizza!");
    System.out.println("Customer name: ");
    String customerName = sc.nextLine();
    String answer ;

    CustomerOrder order = new CustomerOrder(customerName);


    do {
      System.out.println("Pizza number:");
      int number = sc.nextInt();

      Pizza orderedPizza = pizzaMenu.getPizzaByNumber(number);

      // Opdatere ArrayList med antal pizzaer, lægges ind på hver sin ArrayListe plads??
      System.out.println("How many pizzas of no. " + orderedPizza + " ?");

      int quantity = sc.nextInt();
      sc.nextLine();

      order.addPizza(orderedPizza, quantity);

      System.out.println("Do you want to order another pizza (yes or no)?");
      answer = sc.nextLine().trim().toLowerCase();

    } while (answer.equals("yes"));


    System.out.println("Pick-up time:"); // localtime
    int pickUpTime = sc.nextInt();


    orderList.addOrder(order);

  }

/*
  public void orderingScene(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Welcome to Marios Pizza!");
    System.out.println("Please state your name!: ");
    sc.nextLine();

 */





}
