package com.theironyard;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Created by hoseasandstrom on 6/22/16.
 */
@Entity
@Table(name = "purchaseinfo")
public class Purchase {
    int customerId;
    String date;
    String creditCard;
    String ccv;
    String category;

    @ManyToOne
    Customer customer;

    public Purchase(int customerId, String date, String creditCard, String ccv, String category, Customer customer) {
        this.customerId = customerId;
        this.date = date;
        this.creditCard = creditCard;
        this.ccv = ccv;
        this.category = category;
        this.customer = customer;
    }

    public Purchase() {
    }
}
