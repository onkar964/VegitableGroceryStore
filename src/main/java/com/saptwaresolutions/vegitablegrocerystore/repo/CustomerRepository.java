package com.saptwaresolutions.vegitablegrocerystore.repo;

import com.saptwaresolutions.vegitablegrocerystore.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
