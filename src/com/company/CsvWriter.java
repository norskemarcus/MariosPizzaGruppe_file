package com.company;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class CsvWriter {

  public CsvWriter() {
   // writePizzaMenuToFile(); // Udkommenteres når pizzaerne er lagt i csv fil
  }

   public boolean writePizzaMenuToFile()  {

    boolean notSaved = true;
    while(notSaved){
        try{
          PrintStream out = new PrintStream("pizzaMenu.csv");
          PizzaMenu pizzaMenu = new PizzaMenu();

          for(Pizza pizza : pizzaMenu.getPizzaMenu()){
            out.print(pizza.getNumber());
            out.print(";");
            out.print(pizza.getName());
            out.print(";");
            out.print(pizza.getDescription());
            out.print(";");
            out.print(pizza.getPrice());
            out.print("\n");
          }
          notSaved = false;

        } catch (FileNotFoundException exception){
          notSaved = true;
        }

    }
    return notSaved;
   }






}
