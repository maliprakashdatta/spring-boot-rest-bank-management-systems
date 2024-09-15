package com.swsa.controller;
import com.swsa.domain.Account;
import com.swsa.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
    @RestController
    public class AccountController {

        @Autowired
        private AccountService accountService;

        //@RequestMapping(path = "/training", method = RequestMethod.GET)
        @GetMapping("/account")
        public List<Account> retrieveAccounts() {
            return accountService.retrieveAccounts();
        }

        @GetMapping("/account/{accountNumber}")
        public String retrieveAccountForaccountNumber(@PathVariable String accountNumber) {
            return accountService.search(Integer.parseInt(accountNumber));
        }

        @DeleteMapping("/account/{accountNumber}")
        public String deleteAccountForaccountNumber(@PathVariable int accountNumber) {
            return accountService.deleteAccount(accountNumber);
        }

        @PostMapping("/account")
        public String addAccount(@RequestBody Account account) {
            return accountService.storeAccount(account);
        }

        @PutMapping("/account/{accountNumber}")
        public String updateAccountForaccountNumber(@PathVariable int accountNumber, @RequestBody Account account) {

            return accountService.updateAccount(accountNumber, account);
        }

        // Deposit Endpoint
        @PostMapping("/deposit/{accountNumber}")
        public String deposit(@PathVariable int  accountNumber, @RequestBody double amount)
        {
            return accountService.deposit(String.valueOf(accountNumber), amount);
        }


        // Withdraw Endpoint
        @PostMapping("/withdraw/{accountNumber}")
        public String withdraw(@PathVariable String accountNumber, @RequestBody double amount) {
            return accountService.withdraw(accountNumber, amount);
        }

    }




