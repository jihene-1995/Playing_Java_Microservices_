/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.MyHotel.web;

import com.ensi.ilsi.MyHotel.domain.PartySpace;
import com.ensi.ilsi.MyHotel.service.PartySpaceService;
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
@RequestMapping("/api" + "/partySpace")
public class PartySpaceRessource {
    private final PartySpaceService partySpaceService;

    public PartySpaceRessource(PartySpaceService partySpaceService) {
        this.partySpaceService = partySpaceService;
    }

    
    @PostMapping
     public void addPartySpace(PartySpace partySpace) {
        partySpaceService.addPartySpace(partySpace);
    }
     
    @GetMapping
    public List<PartySpace> findAll() {
        return partySpaceService.findAll();
    }

   
    @GetMapping("/{id}")
    public Optional<PartySpace> findById(@PathVariable Long id) {
        return partySpaceService.findById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        partySpaceService.deleteById(id);
    }
    
    
}
