package com.stschool.ecommerce.service;

import com.stschool.ecommerce.exception.CustomerExistsException;
import com.stschool.ecommerce.exception.CustomerNotFoundException;
import com.stschool.ecommerce.model.Customer;

import java.util.List;

public class CustomerService {
    private List<Customer> customers;

    public CustomerService(List<Customer> customers) {
        this.customers = customers;
    }

    public Customer save(Customer customer) {
        customers.stream().filter(c -> c.getId() == customer.getId()).findFirst().ifPresent(c -> {
            throw new CustomerExistsException("Customer already exists with ID: " + customer.getId());
        });
        customers.add(customer);
        return customer;
    }

    public List<Customer> getAllCustomers() {
        return customers;
    }

    public Customer getCustomerById(int id) {
        return customers.stream().filter(c -> c.getId() == id).findFirst().orElseThrow(() -> new CustomerNotFoundException("Customer not found with ID: " + id));
    }

    public boolean deleteCustomer(int id) {
        boolean removed = customers.removeIf(c -> c.getId() == id);
        if (!removed) {
            throw new CustomerNotFoundException("Customer not found with ID: " + id);
        }
        return true;

    }

    public double getTotalBalance() {
        return customers.stream().mapToDouble(Customer::getBalance).sum();
    }
}


