package com.swsa.repository;
import com.swsa.domain.Account;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AccountRepository implements AccountEntryRepository<Account>
{
    private static final Logger logger = LoggerFactory.getLogger(AccountRepository.class);
    private List<Account> accountList= new ArrayList<>();
    private int index = -1;

    public String store(Account account) {
        logger.info("/inside the CardRepository.store()");
        account.setAccountNumber(String.valueOf(++index));
        accountList.add(index, account);
        return account.toString();
    }

    @Override
    public String delete(int accountNumber) {
        logger.info("/inside the AccountRepository.delete()");
        accountList.remove(accountNumber);
        return "card removed";
    }

    @Override
    public List<Account> retrieve() {
        logger.info("/inside the AccountRepository.retrieve()");
        return accountList;
    }

    @Override
    public String search(int index) {
        logger.info("/inside the AccountRepository.search()");
        return this.accountList.get(index).toString();
    }

    @Override
    public String update(Account account) {
        logger.info("/inside the AccountRepository.search()");
        if (!(account.getAccountHolderName().isBlank() ||account.getAccountHolderName().isEmpty())) {
            this.accountList.get(Integer.parseInt(account.getAccountNumber())).setAccountHolderName(account.getAccountHolderName());
        }
        if (account.getBalance() > 0) {
            this.accountList.get((int) account.getBalance()).getBalance(account.getBalance());
        }
        return this.accountList.get(Integer.parseInt(account.getAccountNumber())).toString();
    }

//    public Optional<Object> findById(String accountNumber) {
//        return null;
//    }

}

