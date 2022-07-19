package com.Demo.SOLID.DIP;

import java.util.HashMap;
import java.util.Map;

public class DemoApp {
    public static void main(String[] args) {
        Map<Integer, Customer> customers = new HashMap<>();
        customers.put(1, new Customer("John"));
        customers.put(2, new Customer("Susan"));
        CustomerService customerService = new CustomerService(new SimpleCustomerRepository(customers) {
        });
        customerService.findAll().forEach(customer -> {
            System.out.println(
                    customer.toString()
            );
        });
    }
}
