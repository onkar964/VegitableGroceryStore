package com.saptwaresolutions.vegitablegrocerystore.repo;

import com.saptwaresolutions.vegitablegrocerystore.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
