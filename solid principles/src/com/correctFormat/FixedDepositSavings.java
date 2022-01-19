package com.correctFormat;

public class FixedDepositSavings extends NonWithdrawableSavings {

    FixedDepositSavings(int accNo, String accType) {
        super(accNo, accType);
    }

    public void deposit(double amount) {
        // Add amount ot Balance
        double minFixedDeposit = 100000.0;
        if(amount >= minFixedDeposit){
            Balance += amount;
            System.out.println("Available Balance in " +accType + " account : "+ Balance);
        }
        else{
            System.out.println("Transaction Failed : MinDeposit is "+ minFixedDeposit);
        }
    }

}
