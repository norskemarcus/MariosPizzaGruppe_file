package com.company;

import java.util.ArrayList;

public class UI {

  Pizza pizza1 = new Pizza(1, "Vesuvio", "tomatsauce, ost, skinke og oregano",57);
  Pizza pizza2 = new Pizza(2, "Amerikaner", "tomatsauce, ost, oksefars og oregano", 53);
  Pizza pizza3 = new Pizza (3, "Cacciatore", "tomatsauce, ost, pepperoni og oregano", 57);
  // Pizza pizza4 = new Pizza (4, "Carbona", )

  public void addPizzaToArray (){
    ArrayList<Pizza> pizzas = new ArrayList<>();
    pizzas.add(pizza1);
    pizzas.add(pizza2);

    System.out.println(new CustomerOrder("Ferhat", 1845,pizzas));
  }


}
