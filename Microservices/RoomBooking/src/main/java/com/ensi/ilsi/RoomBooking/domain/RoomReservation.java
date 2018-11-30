/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.RoomBooking.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Objects;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @authors jihene,ahlem,taysir
 */

@Entity
@Table(name = "RoomReservation")
public class RoomReservation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idReservation;

    @Column(name = "reservation_date")
    private String reservation_date;

    @Column(name = "arrival_Date")
    private String arrival_Date;

    @Column(name = "departure_Date")
    private String departure_Date;
    
    @Column(name = "person_nb")
    private int person_nb; 
    
   
    private Long customerID;
    
    @OneToMany(mappedBy = "room")
    @JsonIgnore
    private Set<Room> ReservedRoom ;

    public RoomReservation() {
        //JPA
    }

    public RoomReservation(Long idReservation, String reservation_date, String arrival_Date, String departure_Date, int person_nb, Long customerID, Set<Room> ReservedRoom) {
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

  

    public Set<Room> getReservedRoom() {
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


    public void setReservedRoom(Set<Room> ReservedRoom) {
        this.ReservedRoom = ReservedRoom;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.idReservation);
        hash = 41 * hash + Objects.hashCode(this.reservation_date);
        hash = 41 * hash + Objects.hashCode(this.arrival_Date);
        hash = 41 * hash + Objects.hashCode(this.departure_Date);
        hash = 41 * hash + this.person_nb;
        hash = 41 * hash + Objects.hashCode(this.customerID);
        hash = 41 * hash + Objects.hashCode(this.ReservedRoom);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RoomReservation other = (RoomReservation) obj;
        if (this.person_nb != other.person_nb) {
            return false;
        }
        if (!Objects.equals(this.reservation_date, other.reservation_date)) {
            return false;
        }
        if (!Objects.equals(this.arrival_Date, other.arrival_Date)) {
            return false;
        }
        if (!Objects.equals(this.departure_Date, other.departure_Date)) {
            return false;
        }
        if (!Objects.equals(this.idReservation, other.idReservation)) {
            return false;
        }
        if (!Objects.equals(this.customerID, other.customerID)) {
            return false;
        }
        if (!Objects.equals(this.ReservedRoom, other.ReservedRoom)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RoomReservation{" + "idReservation=" + idReservation + ", reservation_date=" + reservation_date + ", arrival_Date=" + arrival_Date + ", departure_Date=" + departure_Date + ", person_nb=" + person_nb + ", customerID=" + customerID + ", ReservedRoom=" + ReservedRoom + '}';
    }

    
    
    
    
}
