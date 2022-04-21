package com.company;

import java.util.ArrayList;

public class OrderList {
  private CustomerOrder customerOrders;
  private ArrayList<CustomerOrder> customerOrderArrayList = new ArrayList<>();

  public OrderList(CustomerOrder customerOrders){
    this.customerOrders = customerOrders;

  }
}
