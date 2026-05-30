package com.stschool.ecommerce.service;

import com.stschool.ecommerce.model.Customer;
import com.stschool.ecommerce.exception.CustomerExistsException;
import com.stschool.ecommerce.exception.CustomerNotFoundException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceTest {
    private CustomerService customerService;
    private List<Customer> customers;

    @BeforeEach
    public void setUp() {
        customers = new ArrayList<>(List.of(
                Customer.builder().id(1).name("John").email("john@gmail.com").balance(100.0).build(),
                Customer.builder().id(2).name("Jane").email("jane@gmail.com").balance(200.0).build()
                       ));

        customerService = new CustomerService(customers);
    }

    @Test
    @DisplayName("Should add customer successfully when valid data is provided")
    void ShouldAddCustomerWhenValidData() {
        Customer customer = new Customer(3, "John", "john@test.com", 1500);
        Customer result = customerService.save(customer);

        assertEquals("John", result.getName()," customer name should be John");
        assertEquals(3,customerService.getAllCustomers().size(),"customer list should have 3 customers");
    }
    @AfterEach
    public void tearDown() {
        customerService = null;
        customers = null;
    }

}

