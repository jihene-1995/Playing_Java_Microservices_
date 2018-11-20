/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.MyHotel.web;

import com.ensi.ilsi.MyHotel.domain.Payment;
import com.ensi.ilsi.MyHotel.service.PaymentService;
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
 * @author jihene
 */
@RestController
@RequestMapping("/api" + "/payment")
public class PaymentRessource {
    private final PaymentService paymentService;
    
    public PaymentRessource(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    @PostMapping
    public void addPayment(Payment payment) {
        paymentService.addPayment(payment);
    }
    
    
    
    @GetMapping
    public List<Payment> findAll() {
        return paymentService.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Payment> findById(@PathVariable Long id) {
        return paymentService.findById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        paymentService.deleteById(id);
    }

  
   
    
}
