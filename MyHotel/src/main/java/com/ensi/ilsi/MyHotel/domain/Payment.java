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
@Table(name = "payment")
public class Payment {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idInvoice;
    
    @Column(name = "payment_Date")
    private String payment_Date;
    
    @Column(name = "payment_Type")
    private String payment_Type;
    
    @Column(name = "amountt")
    private String amount;

    public Payment() {
        //JPA
    }

    public Payment(Long idInvoice, String payment_Date, String payment_Type, String cost) {
        this.idInvoice = idInvoice;
        this.payment_Date = payment_Date;
        this.payment_Type = payment_Type;
        this.amount = amount;
    }

    public Long getIdInvoice() {
        return idInvoice;
    }

    public String getPayment_Date() {
        return payment_Date;
    }

    public String getPayment_Type() {
        return payment_Type;
    }

    public String getAmount() {
        return amount;
    }

    public void setIdInvoice(Long idInvoice) {
        this.idInvoice = idInvoice;
    }

    public void setPayment_Date(String payment_Date) {
        this.payment_Date = payment_Date;
    }

    public void setPayment_Type(String payment_Type) {
        this.payment_Type = payment_Type;
    }

    public void setAmount(String cost) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Payment{" + "idInvoice=" + idInvoice + ", payment_Date=" + payment_Date + ", payment_Type=" + payment_Type + ", amount=" + amount + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.idInvoice);
        hash = 11 * hash + Objects.hashCode(this.payment_Date);
        hash = 11 * hash + Objects.hashCode(this.payment_Type);
        hash = 11 * hash + Objects.hashCode(this.amount);
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
        final Payment other = (Payment) obj;
        if (!Objects.equals(this.payment_Date, other.payment_Date)) {
            return false;
        }
        if (!Objects.equals(this.payment_Type, other.payment_Type)) {
            return false;
        }
        if (!Objects.equals(this.amount, other.amount)) {
            return false;
        }
        if (!Objects.equals(this.idInvoice, other.idInvoice)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
    
}
