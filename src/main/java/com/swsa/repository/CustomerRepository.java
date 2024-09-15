package com.swsa.repository;
import com.swsa.domain.Card;
import com.swsa.domain.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository implements CustomerEntryRepository<Customer> {
    private static final Logger logger = LoggerFactory.getLogger(CustomerRepository.class);
    private List<Customer> customerList= new ArrayList<>();
    private int index = -1;

    public String store(Customer customer) {
        logger.info("/inside the CustomerRepository.store()");
        customer.setCustomerId(++index);
        customerList.add(index, customer);
        return customer.toString();
    }

    @Override
    public String delete(int CustomerId) {
        logger.info("/inside the CustomerRepository.delete()");
        customerList.remove(CustomerId);
        return "customer removed";
    }

    public List<Customer> retrieve() {
        logger.info("/inside the CustomerRepository.retrieve()");
        return customerList;
    }

    @Override
    public String search(int index) {
        logger.info("/inside the CustomerRepository.search()");
        return this.customerList.get(index).toString();
    }

    @Override
    public String update(Customer customer) {
        logger.info("/inside the CustomerRepository.search()");
        if (!(customer.getName().isBlank() ||customer.getName().isEmpty())) {
            this.customerList.get(customer.getCustomerId()).setName(customer.getName());
        }
        if (customer.getAadhaarNo() > 0) {
            this.customerList.get((int) customer.getAadhaarNo()).setAadhaarNo(customer.getAadhaarNo());
        }
        return this.customerList.get(customer.getCustomerId()).toString();
    }
}

