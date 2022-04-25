package com.company;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;


public class UserInterface {

  private PizzaMenu pizzaMenu;
  private OrderList orderList;
  private boolean running = true;
  private Scanner sc = new Scanner (System.in);

  public UserInterface(){
    this.pizzaMenu = new PizzaMenu();
    this.orderList = new OrderList(orderList);
  }

  public void displayLocalTime(){
    LocalTime now = LocalTime.now();
    System.out.println(now);
  }

  public void systemMenu(){
    System.out.println("Mario´s pizza menu:");

    while(running){

      displayPizzaMenu(); // se menuen hele tiden?
      displaySystemMenu();

      int input = sc.nextInt();

      switch (input){
        case 1 -> makeOrder();
        case 2 -> displayCustomerOrders();
        case 3 -> removePizzaOrder();
        case 4 -> exit();
      }
    }
  }

  public void displayCustomerOrders(){
    ArrayList temp = orderList.getCustomerOrders();
    for (int i = 0; i < temp.size(); i++) {
      if (temp.isEmpty()){
        System.out.println("No orders in the system");
      } else
      System.out.println(orderList.getCustomerOrders().get(i));
    }
  }


  public void displaySystemMenu(){
    System.out.println();
    System.out.println("1. Add order");
    System.out.println("2. Show all orders"); // Foreløbig kun aktive ordre. Egen liste med ordrehistorik med betalt/afleverede pizzaer
    System.out.println("3. Erase order");
    System.out.println("4. Exit ");
    System.out.println();
  }


  public void displayPizzaMenu(){
    for (int i = 0; i < pizzaMenu.getPizzaMenu().size(); i++) {
      System.out.println(pizzaMenu.getPizzaMenu().get(i));
    }
  }

  public void exit(){
    running = false;
  }


  public void makeOrder(){
    System.out.println("Welcome to Marios Pizza!");
    System.out.println("Customer name: ");
    String customerName = sc.nextLine();
    String answer ;

    CustomerOrder order = new CustomerOrder(customerName);
    Pizza orderedPizza;

    do {
      System.out.println("Pizza number:");
      int number = sc.nextInt();

      orderedPizza = pizzaMenu.getPizzaByNumber(number);

      // Opdatere ArrayList med antal pizzaer
      System.out.println("How many pizzas of no. " + orderedPizza + " ?");

      int quantity = sc.nextInt();
      sc.nextLine();

      order.addPizza(orderedPizza, quantity); // Lægger til det antal ønskede pizza af den pizzaen man ønsker

      System.out.println("Do you want to order another pizza (yes or no)?");
      answer = sc.nextLine().trim().toLowerCase();

    } while (answer.equals("yes"));

    System.out.println("Pick-up time (format hh:mm):");
    String pickUpTime = sc.next(); // default format hh:mm:ss
    LocalTime localTime = LocalTime.parse(pickUpTime);

    order.setPickupTime(localTime);
    orderList.addOrder(order);
    System.out.println(order); //TODO: Hvorfor printer denne dobbelt op med pizzaer før Kundenavn etc. med toString metoden??
  }

  public void removePizzaOrder(){ //TODO: SKAL FIKSES!

    System.out.println("Erase order number:");
    int input = sc.nextInt();

    ArrayList temp = orderList.getCustomerOrders();
    for (int i = 0; i < temp.size(); i++) {
      System.out.println(orderList.getCustomerOrders().get(i));

      if (input == i){
        orderList.removeOrder(orderList.getCustomerOrders().get(i));
      }
      else{
        System.out.println("Error message: there is no such order to erase");
      }
    }
  }


  public void newLine(){
    System.out.println("");
  }


}
