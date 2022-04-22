package com.company;

import java.time.LocalTime;
import java.util.Scanner;
// LocalTime now = LocalTime.now();

public class UserInterface {

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
    Pizza orderedPizza;

    do {
      System.out.println("Pizza number:");
      int number = sc.nextInt();

      orderedPizza = pizzaMenu.getPizzaByNumber(number);

      // Opdatere ArrayList med antal pizzaer, lægges ind på hver sin ArrayListe plads??
      System.out.println("How many pizzas of no. " + orderedPizza + " ?");

      int quantity = sc.nextInt();
      sc.nextLine();

      order.addPizza(orderedPizza, quantity); // Lægger til det antal ønskede pizza af den pizzaen man ønsker

      System.out.println("Do you want to order another pizza (yes or no)?");
      answer = sc.nextLine().trim().toLowerCase();

    } while (answer.equals("yes"));


    System.out.println("Pick-up time:"); // use localtime?
    String pickUpTime = sc.next(); // default format hh:mm:ss - hvordan fjerne sekunderne?
    LocalTime localTime = LocalTime.parse(pickUpTime);

    order.setPickupTime(LocalTime.parse(pickUpTime));
    orderList.addOrder(order);

  }


}