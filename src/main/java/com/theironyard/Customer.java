package com.theironyard;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by hoseasandstrom on 6/22/16.
 */
@Entity
@Table(name = "customerinfo")
public class Customer {
    @Id
    @GeneratedValue
    int id;

    String name;
    String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Customer() {
    }
}
