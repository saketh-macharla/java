package com.correctFormat;

public class WithdrawableSavings extends Savings implements Withdraw{

    WithdrawableSavings(int accNo, String accType) {
        super(accNo, accType);
    }


    @Override
    public void withdraw(double amount) {
        double minBalance = 1000.0;
        double balance=getBalance();
        if (balance - amount >= minBalance){
            // Update Balance
            balance -= amount;
            setBalance(balance);
            System.out.println("Available Balance in " +getAccType() + " account : "+ balance);
        }
        else{
            System.out.println("Transaction Failed");
        }
    }
}
