package com.company;

import java.io.FileNotFoundException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;


public class UserInterface {

  private PizzaMenu pizzaMenu;
  private OrderList orderList;
  private CsvWriter csvWriter;
  private CsvReader csvReader;
  private boolean running = true;
  private Scanner sc = new Scanner (System.in);

  public UserInterface() {
    this.pizzaMenu = new PizzaMenu();
    this.orderList = new OrderList(orderList);
    this.csvReader = new CsvReader();
    this.csvWriter = new CsvWriter();
  }

  public void systemMenu() {
    System.out.println("Mario´s pizza menu:");
    System.out.println();

    savePizzaToFile();
    addPizzaToMenu();

    while(running){

      displaySystemMenu();
      int input = sc.nextInt();

      switch (input){
        case 1 -> displayPizzaMenu();
        case 2 -> makeOrder();
        case 3 -> displayCustomerOrders();
        case 4 -> removePizzaOrder();
        case 0 -> exit();
        default -> System.out.println("Tast ind et tal mellem 0 og 4");
      }
    }
  }


  public void addPizzaToMenu(){

    try{
      pizzaMenu = csvReader.addPizzaToMenu();
      System.out.println("Test: Success");
    } catch (FileNotFoundException e) {
      System.out.println("Fejlmelding; filen pizzaMenu.csv kan ikke læses");
    }
  }

  public void savePizzaToFile(){
    // Pizza menuen skal ikke skrives til fil hver gang, men her er fejlmeldingen:
/*
    if(csvWriter.writePizzaMenuToFile()){
      System.out.println("Pizza menu er skrevet til filen csv");
    } else System.out.println("Fejlmelding: fil med pizza menu er ikke skrevet");

 */
  }


  public void displayCustomerOrders(){

    if (orderList.getCustomerOrders().isEmpty()){
      System.out.println("Ingen ordre i systemet");
    } else {
      for (int i = 0; i < orderList.getCustomerOrders().size(); i++) {
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
    System.out.println("3. Vis alle ordre");
    System.out.println("4. Slet ordre");
    System.out.println("0. Afslut ");

  }


  public void displayPizzaMenu() {

      for (Pizza pizza : pizzaMenu.getPizzaMenu()){
        System.out.println(pizza);
      }
      System.out.println();
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

      if (orderedPizza != null){
        System.out.println("Hvor mange pizzaer vil du have af " + orderedPizza + " ?");
      } else {
        System.out.println("Denne pizza findes ikke. Prøv igen");
      }

      int quantity = sc.nextInt();
      sc.nextLine();

      order.addPizza(orderedPizza, quantity);

      System.out.println("Vil du bestille en pizza til (ja/nej)?");
      answer = sc.nextLine().trim().toLowerCase();

    } while (answer.equals("ja"));

    System.out.println("Afhentningstidspunkt (format hh:mm):");
    String pickUpTime = sc.next();
    LocalTime localTime = LocalTime.parse(pickUpTime);

    order.setPickupTime(localTime);
    orderList.addOrder(order);
    System.out.println(order);
  }

  public void removePizzaOrder(){

    System.out.println("Slet ordre nummer:");
    int input = sc.nextInt();

    ArrayList<CustomerOrder> temp = orderList.getCustomerOrders();


    for (CustomerOrder order : temp) {
      System.out.println(order);

      if (input == order.getOrderNumber()) {
        orderList.removeOrder(order);
      } else {
        System.out.println("Ordren findes ikke");
      }
    }
  }
}
