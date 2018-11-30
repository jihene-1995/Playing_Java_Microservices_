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
public class CustomerDto {
    
     private Long idCustomer;
    
    private String firstName;

    private String lastName;
    
    private String nationality;
 
    private String phone;
    
    private String adress;
    
    private String arrival_Date;
    
    private String departure_Date;

    private Set<PaymentDto> invoice ;

    public CustomerDto(Long idCustomer, String firstName, String lastName, String nationality, String phone, String adress, String arrival_Date, String departure_Date, Set<PaymentDto> invoice) {
        this.idCustomer = idCustomer;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
        this.phone = phone;
        this.adress = adress;
        this.arrival_Date = arrival_Date;
        this.departure_Date = departure_Date;
        this.invoice = invoice;
    }

    public void setIdCustomer(Long idCustomer) {
        this.idCustomer = idCustomer;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setArrival_Date(String arrival_Date) {
        this.arrival_Date = arrival_Date;
    }

    public void setDeparture_Date(String departure_Date) {
        this.departure_Date = departure_Date;
    }

    public void setInvoice(Set<PaymentDto> invoice) {
        this.invoice = invoice;
    }

    public Long getIdCustomer() {
        return idCustomer;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public String getPhone() {
        return phone;
    }

    public String getAdress() {
        return adress;
    }

    public String getArrival_Date() {
        return arrival_Date;
    }

    public String getDeparture_Date() {
        return departure_Date;
    }

    public Set<PaymentDto> getInvoice() {
        return invoice;
    }
    
    
}
