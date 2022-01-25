package com.correctFormat;

public class FixedDepositSavings extends NonWithdrawableSavings {

    FixedDepositSavings(int accNo, String accType) {
        super(accNo, accType);
    }

    public void deposit(double amount) {
        // Add amount ot Balance
        double minFixedDeposit = 100000.0;
        double balance = getBalance();
        if(amount >= minFixedDeposit){
            balance += amount;
            System.out.println("Available Balance in " +getAccType() + " account : "+ balance);
            setBalance(balance);
        }
        else{
            System.out.println("Transaction Failed : MinDeposit is "+ minFixedDeposit);
        }
    }

}
