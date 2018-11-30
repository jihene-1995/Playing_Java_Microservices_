/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.Payment.web;

import com.ensi.ilsi.Payment.domain.Customer;
import com.ensi.ilsi.Payment.service.CustomerService;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @authors jihene,ahlem,taysir
 */

@RestController
@RequestMapping("/api" + "/customers")
public class CustomerRessource {
    
    private final CustomerService customerService;

    public CustomerRessource(CustomerService customerService) {
        this.customerService = customerService;
    }

    
    @PostMapping
    public void addCustomer(Customer customer) {
        customerService.addCustomer(customer);
    }
    
    
    
    @GetMapping
    public List<Customer> findAll() {
        return customerService.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Customer> findById(@PathVariable Long id) {
        return customerService.findById(id);
    }
    
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        customerService.deleteById(id);
    }
   
    
}
