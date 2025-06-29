package com.saptwaresolutions.vegitablegrocerystore.config;

import com.saptwaresolutions.vegitablegrocerystore.model.Customer;
import com.saptwaresolutions.vegitablegrocerystore.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandRunner implements CommandLineRunner {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderItemRepository orderItemRepository;
    @Autowired
    private SupplierRepository supplierRepository;
    @Autowired
    private VegetableRepository vegetableRepository;


    @Override
    public void run(String... args) throws Exception {

        Customer customer1 = new Customer();
        customer1.setName("onkar");
        customer1.setEmail("od@gmail.com");
        customer1.setAddress("Dharashiv");
        customerRepository.save(customer1);
        Customer customer2 = new Customer();
        customer2.setName("pk");
        customer2.setEmail("pk@gmail.com");
        customer2.setAddress("Tuljapur");
        customerRepository.save(customer2);




//        Order order1 = new Order();
//        order1.setCustomer(customer1);
    }
}
