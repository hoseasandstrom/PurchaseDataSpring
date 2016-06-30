package com.theironyard;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Date;

/**
 * Created by hoseasandstrom on 6/22/16.
 */
public interface PurchaseRepository extends PagingAndSortingRepository<Purchase, Integer> {
    public Iterable<Purchase> findByDate(Date date);
    public Iterable<Purchase> findByCreditCard(Number creditCard);
    public Page<Purchase> findByCategory(Pageable pageable, String category);
    public Iterable<Purchase> findByOrderByCustomerId();
    public Page<Purchase> findByCustomer(Pageable pageable, Customer customer);





}
