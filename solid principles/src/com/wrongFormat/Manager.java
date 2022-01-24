package com.wrongFormat;



public class Manager {

    static double totalBalance =0;

    void addBalance(Savings account){
        totalBalance += account.balance;
    }
    void addBalance(Current account){
        totalBalance += account.balance;
    }
    void addBalance(FixedDepositSavings account){
        totalBalance += account.balance;
    }


    double getTotalBalance(){
        return totalBalance;
    }
}
