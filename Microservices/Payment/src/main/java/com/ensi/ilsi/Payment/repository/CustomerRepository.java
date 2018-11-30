/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.Payment.repository;

import com.ensi.ilsi.Payment.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @authors jihene,ahlem,taysir
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    
}
