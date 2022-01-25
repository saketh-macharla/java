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
        double balance=getBalance();
        balance += amount;
        System.out.println("Available Balance in " +getAccType() + " account : "+ balance);
        setBalance(balance);
    }

    @Override
    public void interest() {
        // assigning Current Account interest to b_interest
        setBinterest(1.5);

        System.out.println("Current Account interest is "+ getBinterest());
    }

    // Now I want to have two sub classes for Savings
    // withdrawable savings and Non- Withdrawable Savings
}
