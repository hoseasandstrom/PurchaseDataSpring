package com.theironyard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;

/**
 * Created by hoseasandstrom on 6/22/16.
 */
@Controller
public class PurchaseController {

    @Autowired
    CustomerRepository customers;

    @Autowired
    PurchaseRepository purchases;

}
