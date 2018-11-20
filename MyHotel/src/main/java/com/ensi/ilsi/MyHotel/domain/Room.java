/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.MyHotel.domain;

import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author jihene
 */

@Entity
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idRoom;
    
    @Column(name = "state")
    private String state;
    
    @Column(name = "type")
    private String type;

    @Column(name = "type")
    private float price;
    
    @Column(name = "floor_number ")
    private int floor_number ;
    
    public Room() {
        //JPA
    }

    public Room(Long idRoom, String state, String type, float price, int floor_number) {
        this.idRoom = idRoom;
        this.state = state;
        this.type = type;
        this.price = price;
        this.floor_number = floor_number;
    }

    public Long getIdRoom() {
        return idRoom;
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

    public int getFloor_number() {
        return floor_number;
    }

    public void setIdRoom(Long idRoom) {
        this.idRoom = idRoom;
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

    public void setFloor_number(int floor_number) {
        this.floor_number = floor_number;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.idRoom);
        hash = 53 * hash + Objects.hashCode(this.state);
        hash = 53 * hash + Objects.hashCode(this.type);
        hash = 53 * hash + Float.floatToIntBits(this.price);
        hash = 53 * hash + this.floor_number;
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
        final Room other = (Room) obj;
        if (Float.floatToIntBits(this.price) != Float.floatToIntBits(other.price)) {
            return false;
        }
        if (this.floor_number != other.floor_number) {
            return false;
        }
        if (!Objects.equals(this.state, other.state)) {
            return false;
        }
        if (!Objects.equals(this.type, other.type)) {
            return false;
        }
        if (!Objects.equals(this.idRoom, other.idRoom)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Room{" + "idRoom=" + idRoom + ", state=" + state + ", type=" + type + ", price=" + price + ", floor_number=" + floor_number + '}';
    }

    
    
    
}
