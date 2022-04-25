package com.company;

import java.util.ArrayList;

public class OrderList {

  private OrderList orderList;

  private ArrayList<CustomerOrder> customerOrders = new ArrayList<>(); // alle kunde ordre


  public OrderList(OrderList orderList){
    this.orderList = orderList;
  }

  public void addOrder(CustomerOrder order) {
    customerOrders.add(order);
  }

  public void removeOrder(CustomerOrder order){
    customerOrders.remove(order);
  }

  public ArrayList<CustomerOrder> getCustomerOrders() {
 //   customerOrders.sort(CustomerOrder::compareTo);

    return customerOrders;
  }

}
