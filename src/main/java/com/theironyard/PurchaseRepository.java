package com.theironyard;

import org.springframework.data.repository.CrudRepository;

import java.util.Date;

/**
 * Created by hoseasandstrom on 6/22/16.
 */
public interface PurchaseRepository extends CrudRepository<Purchase, Integer> {
    public Iterable<Purchase> findByDate(Date date);
    public Iterable<Purchase> findByCreditCard(Number creditCard);
    public Iterable<Purchase> findByCategory(String category);
    public Iterable<Purchase> findByOrderByCustomerId();

    public Iterable<Purchase> findByCustomer(Customer customer);



}
