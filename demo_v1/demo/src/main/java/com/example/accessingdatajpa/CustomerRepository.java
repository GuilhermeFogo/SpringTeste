package com.example.accessingdatajpa;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
	List<Customer> findByLastName(String lastname);
	Customer findById(long id);
	
	Customer findByFirstNameAndLastName(String firstName, String lastName);
}