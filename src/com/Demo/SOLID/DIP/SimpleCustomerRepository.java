package com.Demo.SOLID.DIP;


import java.util.*;

public class SimpleCustomerRepository implements CustomerRepository{
    private Map<Integer, Customer> customers = new HashMap<>();

    public SimpleCustomerRepository(Map<Integer, Customer> customers) {
        this.customers = customers;
    }

    @Override
    public Optional<Customer> findById(int id) {
        return Optional.ofNullable(customers.get(id));
    }

    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customers.values());
    }
}
