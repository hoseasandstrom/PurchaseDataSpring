package com.theironyard;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by hoseasandstrom on 6/22/16.
 */
public interface CustomerRepository extends CrudRepository<Customer, Integer> {
    public Customer findByName(String name);
    public Customer findByEmail(String email);
}
