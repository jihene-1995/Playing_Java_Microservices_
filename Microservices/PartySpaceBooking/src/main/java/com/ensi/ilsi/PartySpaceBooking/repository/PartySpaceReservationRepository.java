/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.PartySpaceBooking.repository;

import com.ensi.ilsi.PartySpaceBooking.domain.PartySpace;
import com.ensi.ilsi.PartySpaceBooking.domain.PartySpaceReservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @authors jihene,ahlem,taysir
 */
@Repository
public interface PartySpaceReservationRepository extends JpaRepository<PartySpaceReservation, Long>{
    
}
