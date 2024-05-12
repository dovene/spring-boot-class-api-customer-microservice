package com.dev.customermicroservice.service;

import java.util.List;

import com.dev.customermicroservice.model.Customer;

public interface CustomerService {
    List<Customer> getAllCustomers();

    Customer getCustomerById(Long id);

    Customer createCustomer(Customer customer);

    Customer updateCustomer(Long id, Customer customer);

    void deleteCustomer(Long id);
}
