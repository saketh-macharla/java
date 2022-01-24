package com.correctFormat;

public class Current extends BankAccount implements Withdraw,Deposit,Interest{
// Open-closed Principle
// Now Current Account has its own modified  methods(interest, deposit , withdraw)

    Current(int accNo, String accType) {
        super(accNo, accType);
    }


    @Override
    public void deposit(double amount) {
        // Add amount ot Balance
        balance += amount;
        System.out.println("Available Balance in " +accType + " account : "+ balance);
    }

    @Override
    public void withdraw(double amount) {
        double minBalance = 25000.0;
        if (balance - amount >= minBalance){
            // Update Balance
            balance -= amount;
            System.out.println("Available Balance in " +accType + " account : "+ balance);
        }
        else{
            System.out.println("Transaction Failed");
        }
    }

    @Override
    public void interest() {
        // assigning Current Account interest to b_interest
        b_interest=1.5;

        System.out.println("Current Account interest is "+ b_interest);


    }
}

