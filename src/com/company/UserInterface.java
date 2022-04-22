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

/*
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

 */
/*
  public void displayPizzaMenu(){

    pizzaMenu.addPizzaToMenu();

    for (int i = 0; i < pizzaMenu.getPizzaMenu(); i++) {

      System.out.println(i);
    }
  }
 */



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
