package com.swsa.repository;

import java.util.List;
import java.util.Optional;

public interface AccountEntryRepository<Account>
{

    public String store(Account account);

    public List<Account> retrieve();

    public String search(int accountNumber);

    public String delete(int accountNumber);

    public String update(Account account);

    Optional<Object> findById(String accountNumber);
}



