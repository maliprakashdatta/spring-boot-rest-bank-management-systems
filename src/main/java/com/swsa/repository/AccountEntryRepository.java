package com.swsa.repository;
import java.util.List;

public interface AccountEntryRepository<Account>
{

    public String store(Account account);

    public List<Account> retrieve();

    public String search(int accountNumber);

    public String delete(int accountNumber);

    public String update(Account account);

}



