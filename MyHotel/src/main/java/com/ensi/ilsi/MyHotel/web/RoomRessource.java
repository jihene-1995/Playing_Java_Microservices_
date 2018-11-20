/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.MyHotel.web;

import com.ensi.ilsi.MyHotel.domain.Room;
import com.ensi.ilsi.MyHotel.service.RoomService;
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
@RequestMapping("/api" + "/room")
public class RoomRessource {
    private final RoomService roomService;

    public RoomRessource(RoomService roomService) {
        this.roomService = roomService;
    }
    @PostMapping
    public void addRoom(Room room) {
        roomService.addRoom(room);
    }
    
    @GetMapping
    public List<Room> findAll() {
        return roomService.findAll();
    }
    @GetMapping("/{id}")
    public Optional<Room> findById(@PathVariable Long id) {
        return roomService.findById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        roomService.deleteById(id);
    }
  
    
    
}
