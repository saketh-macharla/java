package com.wrongFormat;



public class Manager {

    static double total_balance=0;

    void Add_Balance(Savings account){
        total_balance += account.Balance;
    }
    void Add_Balance(Current account){
        total_balance += account.Balance;
    }
    void Add_Balance(FixedDepositSavings account){
        total_balance += account.Balance;
    }


    double getTotal_Balance(){
        return total_balance;
    }
}
