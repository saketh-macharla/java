package com.correctFormat;

public class Manager {
    BankAccount acc;
    static double totalBalance =0;

    void addBalance(BankAccount account){
        this.acc =account;
        totalBalance += acc.balance;
    }
    double getTotalBalance(){
        return totalBalance;
    }

}
