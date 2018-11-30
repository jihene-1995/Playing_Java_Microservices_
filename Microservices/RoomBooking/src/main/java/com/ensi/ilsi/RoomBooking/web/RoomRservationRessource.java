/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.RoomBooking.web;


import com.ensi.ilsi.RoomBooking.domain.RoomReservation;
import com.ensi.ilsi.RoomBooking.service.RoomReservationService;
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
@RequestMapping("/api" + "/roomRservation")
public class RoomRservationRessource {
   private final RoomReservationService roomReservationService; 

    public RoomRservationRessource(RoomReservationService roomReservationService) {
        this.roomReservationService = roomReservationService;
    }
    @PostMapping
    public void addRoomReservation(RoomReservation roomReservation) {
        roomReservationService.addRoomReservation(roomReservation);
    }
    
    
    
    
    @GetMapping
    public List<RoomReservation> findAll() {
        return roomReservationService.findAll();
    }
    @GetMapping("/{id}")
    public Optional<RoomReservation> findById(@PathVariable Long id) {
        return roomReservationService.findById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        roomReservationService.deleteById(id);
    }
   
   
}
