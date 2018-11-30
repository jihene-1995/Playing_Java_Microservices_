/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ensi.ilsi.Payment.domain;

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
@Table(name = "customer")
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCustomer;
    
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;
    
    @Column(name = "nationality")
    private String nationality;
    
    @Column(name = "phone")
    private String phone;
    
    @Column(name = "adress")
    private String adress;
    
    @Column(name = "arrival_Date")
    private String arrival_Date;
    
    @Column(name = "departure_Date")
    private String departure_Date;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private Set<Payment> invoice ;
    
    
    public Customer() {
        //JPA
    }

    public Customer(Long idCustomer, String firstName, String lastName, String nationality, String phone, String adress, String arrival_Date, String departure_Date, Set<Payment> invoice) {
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

    public Set<Payment> getInvoice() {
        return invoice;
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

    public void setPhone(String telephone) {
        this.phone = telephone;
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

    public void setInvoice(Set<Payment> invoice) {
        this.invoice = invoice;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.idCustomer);
        hash = 71 * hash + Objects.hashCode(this.firstName);
        hash = 71 * hash + Objects.hashCode(this.lastName);
        hash = 71 * hash + Objects.hashCode(this.nationality);
        hash = 71 * hash + Objects.hashCode(this.phone);
        hash = 71 * hash + Objects.hashCode(this.adress);
        hash = 71 * hash + Objects.hashCode(this.arrival_Date);
        hash = 71 * hash + Objects.hashCode(this.departure_Date);
        hash = 71 * hash + Objects.hashCode(this.invoice);
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
        final Customer other = (Customer) obj;
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.nationality, other.nationality)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        if (!Objects.equals(this.adress, other.adress)) {
            return false;
        }
        if (!Objects.equals(this.arrival_Date, other.arrival_Date)) {
            return false;
        }
        if (!Objects.equals(this.departure_Date, other.departure_Date)) {
            return false;
        }
        if (!Objects.equals(this.idCustomer, other.idCustomer)) {
            return false;
        }
        if (!Objects.equals(this.invoice, other.invoice)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Customer{" + "idCustomer=" + idCustomer + ", firstName=" + firstName + ", lastName=" + lastName + ", nationality=" + nationality + ", phone=" + phone + ", adress=" + adress + ", arrival_Date=" + arrival_Date + ", departure_Date=" + departure_Date + ", invoice=" + invoice + '}';
    }

   
    
    
    
    
     
}
