/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.PartySpaceBooking.web;

import com.ensi.ilsi.PartySpaceBooking.domain.PartySpaceReservation;
import com.ensi.ilsi.PartySpaceBooking.service.PartySpaceReservationService;
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
@RequestMapping("/api" + "/partySpaceReservation")
public class PartySpaceReservationRessource {
       private final PartySpaceReservationService partySpaceRservationService;

    public PartySpaceReservationRessource(PartySpaceReservationService partySpaceRservationService) {
        this.partySpaceRservationService = partySpaceRservationService;
    }
    
    @PostMapping
    public void addPartySpaceReservation(PartySpaceReservation partySpaceReservation) {
        partySpaceRservationService.addPartySpaceReservation(partySpaceReservation);
    }
    
    
    @GetMapping
    public List<PartySpaceReservation> findAll() {
        return partySpaceRservationService.findAll();
    }
    @GetMapping("/{id}")
    public Optional<PartySpaceReservation> findById(@PathVariable Long id) {
        return partySpaceRservationService.findById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        partySpaceRservationService.deleteById(id);
    }
       
       
}
