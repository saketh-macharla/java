package com.wrongFormat;

public class Current extends BankAccount {

    Current(int accNo, String accType) {
        super(accNo, accType);
    }

    @Override
    public void deposit(double amount) {
        // Add amount ot Balance
        balance += amount;
        System.out.println("Available Balance "+ balance);
    }

    @Override
    public void withdraw(double amount) {
        double minBalance = 25000.0;
        if (balance - amount >= minBalance){
            // Update Balance
            balance -= amount;
            System.out.println("Available Balance "+ balance);
        }
        else{
            System.out.println("Transaction Failed");
        }
    }
}
