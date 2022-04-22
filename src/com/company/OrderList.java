package com.company;

import java.util.ArrayList;

public class OrderList {

  private ArrayList<CustomerOrder> customerOrders = new ArrayList<>();

  public OrderList(){
  }

  public void addOrder(CustomerOrder order) {
    customerOrders.add(order);
  }

  public ArrayList<CustomerOrder> getCustomerOrders() {
    return customerOrders;
  }
}
