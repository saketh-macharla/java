package com.correctFormat;

public class Manager {
    BankAccount acc;
    static double totalBalance =0;

    void addBalance(BankAccount account){
        this.acc =account;
        totalBalance += acc.getBalance();
    }
    double getTotalBalance(){
        return totalBalance;
    }

}
