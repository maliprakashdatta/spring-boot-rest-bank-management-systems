package com.swsa.domain;
import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Account {

    String accountNumber;
    String accountHolderName;
    double balance;
    String customerId;
    //Customer customer;

    public int getBalance(double balance) {
        return 0;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            throw new IllegalArgumentException("Deposit amount must be greater than zero.");
        }
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
        } else {
            throw new IllegalArgumentException("Insufficient balance or invalid amount.");
        }
    }
}
