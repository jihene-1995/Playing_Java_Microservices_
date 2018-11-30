/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.Payment.service;
import com.ensi.ilsi.Payment.domain.Customer;
import com.ensi.ilsi.Payment.repository.CustomerRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
/**
 *
 * @authors jihene,ahlem,taysir
 */

@Service
@Transactional
public class CustomerService {
    private final Logger log = LoggerFactory.getLogger(CustomerService.class);
    private final CustomerRepository customerRepository;
    
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }   

     public void addCustomer(Customer customer)
    {
        customerRepository.save(customer);
    }
    
    public List<Customer> findAll() {
        log.debug("Request to get all Customers");
        return customerRepository.findAll();
    }

    public Optional<Customer> findById(Long id) {
        log.debug("Request to get Customer : {}", id);
        return customerRepository.findById(id);
    }

    public void deleteById(Long id) {
        log.debug("Request to delete Customer : {}", id);
        customerRepository.deleteById(id);
    }

  
    
}
