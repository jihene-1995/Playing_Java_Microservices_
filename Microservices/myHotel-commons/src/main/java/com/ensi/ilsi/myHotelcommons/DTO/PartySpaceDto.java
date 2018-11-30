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
public class PartySpaceDto {
    private Long idPartySpace;
 
    private String state;
    
    private String type;

    private float price;

    public PartySpaceDto(Long idPartySpace, String state, String type, float price) {
        this.idPartySpace = idPartySpace;
        this.state = state;
        this.type = type;
        this.price = price;
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
    
    
}
