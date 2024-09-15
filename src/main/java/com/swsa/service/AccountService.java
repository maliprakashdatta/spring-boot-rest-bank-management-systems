package com.swsa.service;
import com.swsa.domain.Account;
import com.swsa.repository.AccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AccountService {

    private static final Logger logger = LoggerFactory.getLogger(AccountService.class);

    @Autowired
    private AccountRepository repo;

    public List<Account> retrieveAccounts() {
        logger.info("/inside the AccountService.retrieveAccounts");
        return repo.retrieve();
    }

    public String storeAccount(Account account) {
        logger.info("/inside the AccountService.addAccount");
        return repo.store( account);
    }

    public String deleteAccount(int accountNumber) {
        logger.info("/inside the AccountService.removeAccount");
        return repo.delete(accountNumber);
    }

    public String search(int accountNumber) {
        logger.info("/inside the AccountService.search()");
        return repo.search(accountNumber);
    }

    public String updateAccount(int accountNumber, Account account) {
        logger.info("/inside the AccountService.updateAccount()");
        account.setAccountNumber(String.valueOf(accountNumber));
        return repo.update(account);
    }

            // Deposit Method
        public String deposit(String accountNumber, double amount) {
            Account account = (Account) repo.findById(accountNumber)
                    .orElseThrow(() -> new IllegalArgumentException("Account not found."));
            account.deposit(amount);
            return repo.store(account); // Save updated account
        }

    // Withdraw Method
    public String withdraw(String accountNumber, double amount) {
        Account account = (Account)repo.findById(accountNumber)
                .orElseThrow(() -> new IllegalArgumentException("Account not found."));
        account.withdraw(amount);
        return repo.store(account); // Save updated account
    }

    public String updateAccount(int accountNumber, double amount) {
        return null;
    }

    public String storeAccount(String accountNumber, double amount) {
        return null;
    }
}


