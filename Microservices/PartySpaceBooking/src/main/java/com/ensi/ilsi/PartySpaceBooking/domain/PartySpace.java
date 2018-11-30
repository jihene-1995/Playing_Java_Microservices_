/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.PartySpaceBooking.domain;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @authors jihene,ahlem,taysir
 */

@Entity
@Table(name = "payment")
public class PartySpace {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPartySpace;
    
    @Column(name = "state")
    private String state;
    
    @Column(name = "type")
    private String type;

    @Column(name = "price")
    private float price;

    public PartySpace() {
        //JPA
    }

    public Long getIdPartySpace() {
        return idPartySpace;
    }

    public String getState() {
        return state;
    }

    public String getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public void setIdPartySpace(Long idPartySpace) {
        this.idPartySpace = idPartySpace;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 13 * hash + Objects.hashCode(this.idPartySpace);
        hash = 13 * hash + Objects.hashCode(this.state);
        hash = 13 * hash + Objects.hashCode(this.type);
        hash = 13 * hash + Float.floatToIntBits(this.price);
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
        final PartySpace other = (PartySpace) obj;
        if (Float.floatToIntBits(this.price) != Float.floatToIntBits(other.price)) {
            return false;
        }
        if (!Objects.equals(this.state, other.state)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.idPartySpace, other.idPartySpace)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PartySpace{" + "idPartySpace=" + idPartySpace + ", state=" + state + ", type=" + type + ", price=" + price + '}';
    }

   
    
    
}
