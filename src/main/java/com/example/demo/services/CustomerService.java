package com.example.demo.services;

import com.example.demo.model.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerService {
    List<Customer> listCustomers();
    Customer getCustomerById(UUID id);
}
