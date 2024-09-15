package com.swsa.service;
import com.swsa.domain.Customer;
import com.swsa.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CustomerService {

    private static final Logger logger = LoggerFactory.getLogger(CustomerService.class);

    @Autowired
    private CustomerRepository repo;

    public List<Customer> retrieveCustomers() {
        logger.info("/inside the CustomerService.retrieveCustomers()");
        return repo.retrieve();
    }

    public String storeCustomer(Customer customer) {
        logger.info("/inside the CustomerService.addCustomer()");
        return repo.store(customer);
    }

    public String deleteCustomer(int customerId) {
        logger.info("/inside the CustomerService.removeCustomer()");
        return repo.delete(customerId);
    }

    public String search(int customerId) {
        logger.info("/inside the CustomerService.search()");
        return repo.search(customerId);
    }

    public String updateCustomer(int customerId, Customer customer) {
        logger.info("/inside the CustomerService.updateCustomer()");
        customer.setCustomerId(customerId);
        return repo.update(customer);
    }
}

