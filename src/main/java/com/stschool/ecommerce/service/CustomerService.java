package com.stschool.ecommerce.service;

import com.stschool.ecommerce.exception.CustomerExistsException;
import com.stschool.ecommerce.model.Customer;

import java.util.List;

public class CustomerService {
    private List<Customer> customers;

    public CustomerService(List<Customer> customers) {
        this.customers = customers;
    }

    public Customer save(Customer customer) {
        customers.stream().filter(c -> c.getId() == customer.getId()).findFirst().ifPresent(c -> {
            throw new CustomerExistsException("Customer already exists");
        });
        customers.add(customer);
        return customer;
    }


}
