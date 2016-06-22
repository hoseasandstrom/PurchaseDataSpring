package com.theironyard;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by hoseasandstrom on 6/22/16.
 */
public interface PurchaseRepository extends CrudRepository<Purchase, Integer> {
    public Iterable<Purchase> findByCustomerId(int customerId);
    public Iterable<Purchase> findByDate(String date);
    public Iterable<Purchase> findByCreditCard(String creditCard);
    public Iterable<Purchase> findByCategory(String category);
    public Iterable<Purchase> findByCustomer(Customer customer);

}
