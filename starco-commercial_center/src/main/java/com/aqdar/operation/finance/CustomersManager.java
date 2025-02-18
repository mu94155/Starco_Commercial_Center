package com.aqdar.operation.finance;

import java.util.ArrayList;
import java.util.List;

public class CustomersManager {
  Customer customer;
  List<Customer> customers = new ArrayList<>();
  
//constructor
  CustomersManager(Customer customer) {
    // Initialize the database connection
    this.customer = customer;
  }

    public void addCustomer(Customer customer) {
        // Add customer to the database
        customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        // Remove customer from the database
        customers.remove(customer);
    }

    public void updateCustomer(Customer customer) {
        // Update customer in the database
        customers.add(customer);
    }

    public Customer getCustomer(int id) {
        // Get customer from the database
        if (id == customer.getId()) {
            return customer;
        }
        return null;
    }

    public List<Customer> getCustomers() {
        // Get all customers from the database
        return null;
    }

}
