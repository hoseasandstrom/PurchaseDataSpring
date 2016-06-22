package com.theironyard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;
import java.util.Date;


/**
 * Created by hoseasandstrom on 6/22/16.
 */
@Controller
public class PurchaseController {

    @Autowired
    CustomerRepository customers;

    @Autowired
    PurchaseRepository purchases;

    @PostConstruct
    public void init() {
        if (customers.count() == 0) {
            Customer customer = new Customer();

            customers.save(customer);
        }
    }

    @RequestMapping(path = "/", method= RequestMethod.GET)
    public String home(Model model, Integer customerId, Date date, String category) {

        Iterable<Purchase> purchs;

            if (customerId != null) {
                purchs = purchases.findByCustomerId(customerId);
            }
            else if (date != null) {
                purchs = purchases.findByDate(date);
            }
            else  {
                purchs = purchases.findByCategory(category);
            }

            model.addAttribute("purchases", purchs);
            return "home";
        }
    }

}
