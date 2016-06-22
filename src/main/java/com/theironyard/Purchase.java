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
    Date date;

    @Column(nullable = false)
    Number creditCard;

    @Column(nullable = false)
    Number ccv;

    @Column(nullable = false)
    String category;

    @ManyToOne
    Customer customer;

    public Purchase(int customerId, Date date, Number creditCard, Number ccv, String category, Customer customer) {
        this.customerId = customerId;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Number getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(Number creditCard) {
        this.creditCard = creditCard;
    }

    public Number getCcv() {
        return ccv;
    }

    public void setCcv(Number ccv) {
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
