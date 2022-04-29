package com.company;

import java.util.ArrayList;


public class PizzaMenu {

  private ArrayList<Pizza> pizzaMenu = new ArrayList<>();

  public PizzaMenu() {
   //addPizzaToMenu(); // Used to save pizzas to file
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


  public void addPizzaToMenu() {
/*
    pizzaMenu.add(pizza1);
    pizzaMenu.add(pizza2);
    pizzaMenu.add(pizza3);
    pizzaMenu.add(pizza4);
    pizzaMenu.add(pizza5);
    pizzaMenu.add(pizza6);
    pizzaMenu.add(pizza7);
    pizzaMenu.add(pizza8);
    pizzaMenu.add(pizza9);
    pizzaMenu.add(pizza10);
    pizzaMenu.add(pizza11);
    pizzaMenu.add(pizza12);
    pizzaMenu.add(pizza13);
    pizzaMenu.add(pizza14);


 */
  }



  public ArrayList<Pizza> getPizzaMenu() {
    return pizzaMenu;
  }

  public Pizza getPizzaByNumber(int number){

    for (Pizza pizza : pizzaMenu) {

      if (pizza.getNumber() == number) {
        return pizza;
      }

    }
    return null;
  }
}
