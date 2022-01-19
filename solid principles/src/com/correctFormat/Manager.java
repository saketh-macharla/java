package com.correctFormat;

public class Manager {
    BankAccount Account;
    static double total_balance=0;

    void Add_Balance(BankAccount account){
        this.Account=account;
        total_balance += Account.Balance;
    }
    double getTotal_Balance(){
        return total_balance;
    }

}
