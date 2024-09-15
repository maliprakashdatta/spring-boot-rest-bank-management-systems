package com.swsa.repository;
import com.swsa.domain.Customer;
import java.util.List;

public interface CustomerEntryRepository<Customer>
{

    public String store(Customer customer);

    public List<Customer> retrieve();

    public String search(int customerId);

    public String delete(int customerId);

    public String update(Customer customer);
}
