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
    System.out.println("");

    while(running){
      displaySystemMenu();
      int input = sc.nextInt();

      switch (input){
        case 1 -> displayPizzaMenu();
        case 2 -> makeOrder();
        case 3 -> displayCustomerOrders();
        case 4 -> removePizzaOrder();
        case 5 -> exit();
      }
    }
  }

  public void displayCustomerOrders(){
    ArrayList temp = orderList.getCustomerOrders();

    if (temp.isEmpty()){
      System.out.println("Ingen ordre i systemet");
    } else {
      for (int i = 0; i < temp.size(); i++) {
        System.out.println(orderList.getCustomerOrders().get(i));
        whenToMakePizza(i);
      }
    }
  }

  public void whenToMakePizza(int i){
    System.out.println("Hvornår Mario skal begynde med ordren");
    System.out.println(orderList.getCustomerOrders().get(i).getPickupTime1().minusMinutes(10));
    System.out.println();
  }


  public void displaySystemMenu(){
    System.out.println("1. Se menu");
    System.out.println("2. Læg til ordre");
    System.out.println("3. Vis alle ordre"); // Foreløbig kun aktive ordre. Egen liste med ordrehistorik med betalt/afleverede pizzaer
    System.out.println("4. Slet ordre");
    System.out.println("5. Afslut ");
    System.out.println("");
  }


  public void displayPizzaMenu(){
    for (int i = 0; i < pizzaMenu.getPizzaMenu().size(); i++) {
      System.out.println(pizzaMenu.getPizzaMenu().get(i));
    }
    System.out.println("");
  }

  public void exit(){
    running = false;
  }


  public void makeOrder(){

    Scanner sc = new Scanner(System.in);

    System.out.println("Velkommen til Marios Pizza!");
    System.out.println("Kundenavn: ");
    String customerName = sc.nextLine();
    String answer ;

    CustomerOrder order = new CustomerOrder(customerName);
    Pizza orderedPizza;

    do {
      System.out.println("Pizza nummer:");
      int number = sc.nextInt();

      orderedPizza = pizzaMenu.getPizzaByNumber(number);

      // Opdatere ArrayList med antal pizzaer
      System.out.println("Hvor mange pizzaer vil du have af " + orderedPizza + " ?");

      int quantity = sc.nextInt();
      sc.nextLine();

      order.addPizza(orderedPizza, quantity); // Lægger til det antal ønskede pizza af den pizzaen man ønsker

      System.out.println("Vil du bestille en pizza til (ja/nej)?");
      answer = sc.nextLine().trim().toLowerCase();

    } while (answer.equals("ja"));

    System.out.println("Afhentningstidspunkt (format hh:mm):");
    String pickUpTime = sc.next(); // default format hh:mm:ss
    LocalTime localTime = LocalTime.parse(pickUpTime);

    order.setPickupTime(localTime);
    orderList.addOrder(order);
    System.out.println(order);
  }

  public void removePizzaOrder(){

    System.out.println("Slet ordre nummer:");
    int input = sc.nextInt();

    ArrayList<CustomerOrder> temp = orderList.getCustomerOrders();
    // orderNumber

    for (int i = 0; i < temp.size(); i++) {
      CustomerOrder order = temp.get(i);
      System.out.println(order);

      if (input == order.getOrderNumber()){
        orderList.removeOrder(order); //CustomerOrder
      }
      else{
        System.out.println("Ordren findes ikke");
      }
    }
  }
}
