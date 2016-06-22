package com.theironyard;


import javax.persistence.*;
import java.util.Date;

/**
 * Created by hoseasandstrom on 6/22/16.
 */
@Entity
@Table(name = "purchaseinfo")

public class Purchase {
    @Id
    int customerId;

    @Column(nullable = false)
    String date;

    @Column(nullable = false)
    String creditCard;

    @Column(nullable = false)
    String ccv;

    @Column(nullable = false)
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

    public Purchase() {
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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
