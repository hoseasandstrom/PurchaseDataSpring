package com.theironyard;


import javax.persistence.*;


/**
 * Created by hoseasandstrom on 6/22/16.
 */
@Entity
@Table(name = "purchases")

public class Purchase {
    @Id
    @GeneratedValue
    int purchaseId;


    String date;


    String creditCard;


    String ccv;


    String category;

    @ManyToOne
    Customer customer;

    public Purchase(String date, String creditCard, String ccv, String category, Customer customer) {
        this.date = date;
        this.creditCard = creditCard;
        this.ccv = ccv;
        this.category = category;
        this.customer = customer;
    }

    public Purchase(int purchaseId, String date, String creditCard, String ccv, String category, Customer customer) {
        this.purchaseId = purchaseId;
        this.date = date;
        this.creditCard = creditCard;
        this.ccv = ccv;
        this.category = category;
        this.customer = customer;
    }

    public Purchase() {
    }

    public int getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Purchase(int purchaseId) {
        this.purchaseId = purchaseId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getCcv() {
        return ccv;
    }

    public void setCcv(String ccv) {
        this.ccv = ccv;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
