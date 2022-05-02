package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

//load = scanne et dokument og lager pizzaer ud i fra oplysninger i filen: pizzaMenu.csv
public class CsvReader {

  private PizzaMenu pizzaMenu;

  public CsvReader() {
    this.pizzaMenu = new PizzaMenu();
  }

  public PizzaMenu addPizzaToMenu() throws FileNotFoundException {
    // load pizzas from database-filen (pizzaMenu.csv)

    Scanner fileScanner = new Scanner(new File("pizzaMenu.csv"));

    while (fileScanner.hasNextLine()) {
      String line = fileScanner.nextLine();
      Scanner input = new Scanner(line).useDelimiter(";").useLocale(Locale.ENGLISH);
      int number = input.nextInt();
      String name = input.next();
      String description = input.next();
      int price = input.nextInt();

      Pizza pizza = new Pizza(number, name, description, price);

      pizzaMenu.getPizzaMenu().add(pizza);
    }
    fileScanner.close();

    return pizzaMenu;
  }
}
