/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.PartySpaceBooking.domain;

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
@Table(name = "PartySpaceReservation")
public class PartySpaceReservation {
   
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
    
    @OneToMany(mappedBy = "PartySpace")
    @JsonIgnore
    private Set<PartySpace> partySpace ;

    public PartySpaceReservation() {
        //JPA
    }

    public PartySpaceReservation(Long idReservation, String reservation_date, String arrival_Date, String departure_Date, int person_nb, Long customerID, Set<PartySpace> partySpace) {
        this.idReservation = idReservation;
        this.reservation_date = reservation_date;
        this.arrival_Date = arrival_Date;
        this.departure_Date = departure_Date;
        this.person_nb = person_nb;
        this.customerID = customerID;
        this.partySpace = partySpace;
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

    public Long getCustomer() {
        return customerID;
    }

    public Set<PartySpace> getPartySpace() {
        return partySpace;
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

    public void setPartySpace(Set<PartySpace> partySpace) {
        this.partySpace = partySpace;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.idReservation);
        hash = 97 * hash + Objects.hashCode(this.reservation_date);
        hash = 97 * hash + Objects.hashCode(this.arrival_Date);
        hash = 97 * hash + Objects.hashCode(this.departure_Date);
        hash = 97 * hash + this.person_nb;
        hash = 97 * hash + Objects.hashCode(this.customerID);
        hash = 97 * hash + Objects.hashCode(this.partySpace);
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
        final PartySpaceReservation other = (PartySpaceReservation) obj;
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
        if (!Objects.equals(this.partySpace, other.partySpace)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PartySpaceReservation{" + "idReservation=" + idReservation + ", reservation_date=" + reservation_date + ", arrival_Date=" + arrival_Date + ", departure_Date=" + departure_Date + ", person_nb=" + person_nb + ", customerID=" + customerID + ", partySpace=" + partySpace + '}';
    }
    
    

    
}
