package com.example.demo.services;

import com.example.demo.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

@Service
@Slf4j
public class CustomerServiceImpl implements CustomerService{

    private HashMap<UUID,Customer> customerHashMap;

    public CustomerServiceImpl(){
        this.customerHashMap = new HashMap<>();


        Customer c1 = Customer
                .builder()
                .customerName("Diya Ramteke")
                .id(UUID.randomUUID())
                .version(1)
                .createdTime(LocalDateTime.now())
                .lastModified(LocalDateTime.now())
                .build();

        Customer c2 = Customer
                .builder()
                .customerName("Pranay Ramteke")
                .id(UUID.randomUUID())
                .version(1)
                .createdTime(LocalDateTime.now())
                .lastModified(LocalDateTime.now())
                .build();

        Customer c3 = Customer
                .builder()
                .customerName("Sheldon Cooper")
                .id(UUID.randomUUID())
                .version(1)
                .createdTime(LocalDateTime.now())
                .lastModified(LocalDateTime.now())
                .build();
        customerHashMap.put(c1.getId(),c1);
        customerHashMap.put(c2.getId(),c2);
        customerHashMap.put(c3.getId(),c3);

    }

    @Override
    public List<Customer> listCustomers() {
        return new LinkedList<Customer>(customerHashMap.values());
    }

    @Override
    public Customer getCustomerById(UUID id) {
        return customerHashMap.get(id);
    }
}
