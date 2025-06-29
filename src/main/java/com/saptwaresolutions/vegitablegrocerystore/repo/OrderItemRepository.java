package com.saptwaresolutions.vegitablegrocerystore.repo;

import com.saptwaresolutions.vegitablegrocerystore.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
