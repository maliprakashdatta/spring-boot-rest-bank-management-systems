package com.swsa.controller;

import com.swsa.domain.Card;
import com.swsa.domain.Customer;
import com.swsa.service.CardService;
import com.swsa.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    //@RequestMapping(path = "/training", method = RequestMethod.GET)
    @GetMapping("/customer")
    public List<Customer> retrieveCustomers() {
        return customerService.retrieveCustomers();
    }

    @GetMapping("/customer/{ customerId}")
    public String retrieveCustomersForcustomerId(@PathVariable int customerId) {
        return customerService.search(customerId);
    }

    @DeleteMapping("/customer/{customerId}")
    public String deleteCustomerForaccountNumber(@PathVariable int customerId) {
        return customerService.deleteCustomer(customerId);
    }

    @PostMapping("/customer")
    public String addCustomer(@RequestBody Customer customer) {
        return customerService.storeCustomer(customer);
    }

    @PutMapping("/customer/{cardId}")
    public String updateCustomerForcustomerId(@PathVariable int customerId, @RequestBody Customer customer) {

        return customerService.updateCustomer(customerId, customer);
    }


}




