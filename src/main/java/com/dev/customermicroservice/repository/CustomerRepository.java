package com.dev.customermicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dev.customermicroservice.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
