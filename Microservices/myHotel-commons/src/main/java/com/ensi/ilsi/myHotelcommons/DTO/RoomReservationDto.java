/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.myHotelcommons.DTO;

import java.util.Set;

/**
 *
 * @authors jihene,ahlem,taysir
 */
public class RoomReservationDto {
    private Long idReservation;

    
    private String reservation_date;

    
    private String arrival_Date;

    private String departure_Date;
    
   
    private int person_nb; 
    
   
    private Long customerID;
    
  
    private Set<RoomDto> ReservedRoom ;

    public RoomReservationDto(Long idReservation, String reservation_date, String arrival_Date, String departure_Date, int person_nb, Long customerID, Set<RoomDto> ReservedRoom) {
        this.idReservation = idReservation;
        this.reservation_date = reservation_date;
        this.arrival_Date = arrival_Date;
        this.departure_Date = departure_Date;
        this.person_nb = person_nb;
        this.customerID = customerID;
        this.ReservedRoom = ReservedRoom;
    }

    public Long getIdReservation() {
        return idReservation;
    }

    public String getReservation_date() {
        return reservation_date;
    }

    public String getArrival_Date() {
        return arrival_Date;
    }

    public String getDeparture_Date() {
        return departure_Date;
    }

    public int getPerson_nb() {
        return person_nb;
    }

    public Long getCustomerID() {
        return customerID;
    }

    public Set<RoomDto> getReservedRoom() {
        return ReservedRoom;
    }

    public void setIdReservation(Long idReservation) {
        this.idReservation = idReservation;
    }

    public void setReservation_date(String reservation_date) {
        this.reservation_date = reservation_date;
    }

    public void setArrival_Date(String arrival_Date) {
        this.arrival_Date = arrival_Date;
    }

    public void setDeparture_Date(String departure_Date) {
        this.departure_Date = departure_Date;
    }

    public void setPerson_nb(int person_nb) {
        this.person_nb = person_nb;
    }

    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }

    public void setReservedRoom(Set<RoomDto> ReservedRoom) {
        this.ReservedRoom = ReservedRoom;
    }
    
    
}
