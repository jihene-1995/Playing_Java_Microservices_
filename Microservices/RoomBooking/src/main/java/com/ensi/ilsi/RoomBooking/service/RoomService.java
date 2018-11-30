/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.RoomBooking.service;

import com.ensi.ilsi.RoomBooking.domain.Room;
import com.ensi.ilsi.RoomBooking.repository.RoomRepository;
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
public class RoomService {
    private final Logger log = LoggerFactory.getLogger(RoomService.class);
    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }
    
       public void addRoom(Room room)
    {
        roomRepository.save(room);
    }

    public List<Room> findAll() {
        log.debug("Request to get all Room");
        return roomRepository.findAll();
    }

    public Optional<Room> findById(Long id) {
        log.debug("Request to get Room : {}", id);
        return roomRepository.findById(id);
    }

    public void deleteById(Long id) {
        log.debug("Request to delete Room : {}", id);
        roomRepository.deleteById(id);
    }
    
    
}
