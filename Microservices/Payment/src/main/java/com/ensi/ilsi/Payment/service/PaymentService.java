/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.Payment.service;

import com.ensi.ilsi.Payment.domain.Payment;
import com.ensi.ilsi.Payment.repository.PaymentRepository;
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
public class PaymentService {
   private final Logger log = LoggerFactory.getLogger(PaymentService.class);
   private final PaymentRepository paymentRepository; 

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    } 

      public void addPayment(Payment payment)
    {
        paymentRepository.save(payment);
    }
    
    public List<Payment> findAll() {
         log.debug("Request to get all Invoice");
        return paymentRepository.findAll();
    }

    public Optional<Payment> findById(Long id) {
         log.debug("Request to get payment : {}", id);
        return paymentRepository.findById(id);
    }

    public void deleteById(Long id) {
        log.debug("Request to delete payment : {}", id);
        paymentRepository.deleteById(id);
    }
   
   
}
