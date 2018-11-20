/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.MyHotel.service;

import com.ensi.ilsi.MyHotel.domain.Payment;
import com.ensi.ilsi.MyHotel.domain.RoomReservation;
import com.ensi.ilsi.MyHotel.repository.RoomReservationRepository;
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
public class RoomReservationService {
   private final Logger log = LoggerFactory.getLogger(RoomReservationService.class);
   private final RoomReservationRepository roomReservationRepository; 

    public RoomReservationService(RoomReservationRepository roomReservationRepository) {
        this.roomReservationRepository = roomReservationRepository;
    }
    
      public void addRoomReservation(RoomReservation roomReservation)
    {
        roomReservationRepository.save(roomReservation);
    }

    public List<RoomReservation> findAll() {
        log.debug("Request to get all RoomReservation");
        return roomReservationRepository.findAll();
    }

    public Optional<RoomReservation> findById(Long id) {
        log.debug("Request to get RoomReservation : {}", id);
        return roomReservationRepository.findById(id);
    }

    public void deleteById(Long id) {
        log.debug("Request to delete RoomReservation : {}", id);
        roomReservationRepository.deleteById(id);
    }

   
}
