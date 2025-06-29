package com.saptwaresolutions.vegitablegrocerystore.repo;

import com.saptwaresolutions.vegitablegrocerystore.model.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VegetableRepository extends JpaRepository<Vegetable,Long> {



}
