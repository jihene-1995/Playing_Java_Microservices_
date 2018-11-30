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
public class PaymentDto {
   private Long idInvoice;
    
    private String payment_Date;
    
    private String payment_Type;

    private String amount;  

    public PaymentDto(Long idInvoice, String payment_Date, String payment_Type, String amount) {
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

    public void setAmount(String amount) {
        this.amount = amount;
    }
    
    
    
}
