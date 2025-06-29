package com.saptwaresolutions.vegitablegrocerystore.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "vegetables")
@Data
public class Vegetable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private double price;

    private int stock_qty;

    @ManyToMany(mappedBy = "vegetable", fetch = FetchType.LAZY)
    @JsonBackReference
    private Set<Supplier> supplier = new HashSet<>();


}
