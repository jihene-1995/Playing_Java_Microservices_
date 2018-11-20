/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.MyHotel.repository;

import com.ensi.ilsi.MyHotel.domain.PartySpace;
import com.ensi.ilsi.MyHotel.domain.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jihene
 */
@Repository
public interface RoomRepository extends JpaRepository<Room, Long>{
    
}
