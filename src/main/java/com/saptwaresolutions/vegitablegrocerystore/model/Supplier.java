package com.saptwaresolutions.vegitablegrocerystore.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "suppliers")
@Data
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "supplier_name")
    private String name;

    @Column(name = "supplier_contact")
    private String contact;

    @ManyToMany
    @JsonManagedReference
    @JoinTable(
            name = "vegetable_supplier",
            joinColumns = @JoinColumn(name = "supplier_id"),           // Supplier ID
            inverseJoinColumns = @JoinColumn(name = "vegetable_id")    // Vegitable ID
    )
    private List<Vegetable> vegetable=new ArrayList<>();


}