/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.myHotelcommons.DTO;

/**
 *
 * @authors jihene,ahlem,taysir
 */
public class RoomDto {
    private Long idRoom;
    
    private String state;
    
    private String type;

    private float price;
 
    private int floor_number ;

    public RoomDto(Long idRoom, String state, String type, float price, int floor_number) {
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
    
    
    
}
