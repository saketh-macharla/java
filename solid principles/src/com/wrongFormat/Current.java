package com.wrongFormat;

public class Current extends BankAccount {

    Current(int accNo, String accType) {
        super(accNo, accType);
    }

    @Override
    public void deposit(double amount) {
        // Add amount ot Balance
        Balance += amount;
        System.out.println("Available Balance "+ Balance);
    }

    @Override
    public void withdraw(double amount) {
        double minBalance = 25000.0;
        if (Balance - amount >= minBalance){
            // Update Balance
            Balance -= amount;
            System.out.println("Available Balance "+ Balance);
        }
        else{
            System.out.println("Transaction Failed");
        }
    }
}
