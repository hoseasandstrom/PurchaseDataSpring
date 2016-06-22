package com.theironyard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;


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
    public void init() throws IOException {
        if (customers.count() == 0) {
            File c = new File("customer.csv");
            Scanner fileScanner = new Scanner(c);
            fileScanner.nextLine();
            while (fileScanner.hasNext()) {
                String[] columns = fileScanner.nextLine().split(",");
                Customer customer = new Customer(columns[0], columns[1]);
                customers.save(customer);
            }
        }

        if (purchases.count() == 0) {
            File p = new File("customer.csv");
            Scanner fileScanner = new Scanner(p);
            fileScanner.nextLine();
            while (fileScanner.hasNext()) {
                String[] columns = fileScanner.nextLine().split(",");
                Purchase purchase = new Purchase(columns[1],columns[2], columns[3], columns[4], customers.findOne(Integer.valueOf(columns[5])));
                purchases.save(purchase);
            }
        }
    }

    @RequestMapping(path = "/", method= RequestMethod.GET)
    public String home(Model model, Integer customerId, Date date, String category) {

        Iterable<Purchase> purchs;

            if (category != null) {
                purchs = purchases.findByCategory(category);
            } else {
                purchs = purchases.findAll();
            }

            model.addAttribute("purchases", purchs);
            return "home";
        }
    }
