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


  public PizzaMenu addPizzaToMenu() {
    // load pizzas from database-filen (pizzaMenu.csv)

    try{
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
    }
    catch (FileNotFoundException exception){
    // OBS: Her burde det være en boolean som sendes i retur med en sout i UI, men jeg vil også sende pizzaMenu....så nødløsning!
      System.out.println("Fejlmelding; filen pizzaMenu.csv kan ikke læses");
    }
    return pizzaMenu;
  }
}
