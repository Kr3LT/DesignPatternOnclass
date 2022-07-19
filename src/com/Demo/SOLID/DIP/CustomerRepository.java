package com.Demo.SOLID.DIP;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository {

    Optional<Customer> findById(int id);

    List<Customer> findAll();
}
