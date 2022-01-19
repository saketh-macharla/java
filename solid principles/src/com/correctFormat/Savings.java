package com.correctFormat;

public class Savings extends BankAccount implements Deposit, Interest{
// Openclosed Principle
// Now Current Account has its own modified  methods(interest, deposit , withdraw)


    Savings(int accNo, String accType) {
        super(accNo, accType);
    }

    @Override
    public void deposit(double amount) {
        // Add amount ot Balance
        Balance += amount;
        System.out.println("Available Balance in " +accType + " account : "+ Balance);
    }

    @Override
    public void interest() {
        // assigning Saving Account interest to b_interest
        b_interest=2.0;

        System.out.println("Saving Account interest is "+ b_interest);
    }

    // Now I want to have two sub classes for Savings
    // withdrawable savings and Non- Withdrawable Savings
}
