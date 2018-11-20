/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.MyHotel.service;

import com.ensi.ilsi.MyHotel.domain.PartySpaceReservation;
import com.ensi.ilsi.MyHotel.repository.PartySpaceReservationRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 *
 * @author jihene
 */
@Service
@Transactional
public class PartySpaceReservationService {
    private final Logger log = LoggerFactory.getLogger(PartySpaceReservationService.class);
    private final PartySpaceReservationRepository partySpaceReservationRepository;

    public PartySpaceReservationService(PartySpaceReservationRepository partySpaceReservationRepository) {
        this.partySpaceReservationRepository = partySpaceReservationRepository;
    }
    
    public void addPartySpaceReservation(PartySpaceReservation partySpaceReservation)
    {
        partySpaceReservationRepository.save(partySpaceReservation);
    }
    
    public List<PartySpaceReservation> findAll() {
        log.debug("Request to get all PartySpaceReservation");
        return partySpaceReservationRepository.findAll();
    }

    public Optional<PartySpaceReservation> findById(Long id) {
        log.debug("Request to get PartySpaceReservation : {}", id);
        return partySpaceReservationRepository.findById(id);
    }

    public void deleteById(Long id) {
        log.debug("Request to delete PartySpacereservation : {}", id);
        partySpaceReservationRepository.deleteById(id);
    }
    
    
}
