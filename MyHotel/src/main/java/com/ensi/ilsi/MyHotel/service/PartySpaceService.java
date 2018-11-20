/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.MyHotel.service;

import com.ensi.ilsi.MyHotel.domain.PartySpace;
import com.ensi.ilsi.MyHotel.repository.PartySpaceRepository;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author jihene
 */
public class PartySpaceService {
    private final Logger log = LoggerFactory.getLogger(PartySpaceService.class);
    private final PartySpaceRepository partySpaceRepository;

    public PartySpaceService(PartySpaceRepository partySpaceRepository) {
        this.partySpaceRepository = partySpaceRepository;
    }

     public void addPartySpace(PartySpace partySpace)
    {
        partySpaceRepository.save(partySpace);
    }
    
    public List<PartySpace> findAll() {
        log.debug("Request to get all PartySpace");
        return partySpaceRepository.findAll();
    }

    public Optional<PartySpace> findById(Long id) {
        log.debug("Request to get PartySpace : {}", id);
        return partySpaceRepository.findById(id);
    }

    public void deleteById(Long id) {
        log.debug("Request to delete PartySpace : {}", id);
        partySpaceRepository.deleteById(id);
    }
}
