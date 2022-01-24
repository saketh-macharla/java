package com.correctFormat;


public abstract class BankAccount {
    public int accNo;
    public String accType;
    public double balance;
    public double b_interest;


    BankAccount(int accNo, String accType){
        this.accNo=accNo;
        this.accType=accType;
        this.balance =0;
    }


    /*
Removed and placed in an Interface => to make it follow Openclosed Principle
    void interest(){
        if(accType == "Savings"){
            b_interest=2.0;
        }
        else if(accType == "Current") {
            b_interest = 4.0;
        }
    }
*/


/*

 Deposit and Withdraw are moved to a new interface
 This class follows Single Responsibility Principle

*/

}

