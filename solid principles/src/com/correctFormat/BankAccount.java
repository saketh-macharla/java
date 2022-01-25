package com.correctFormat;


public abstract class BankAccount {
    private int accNo;
    private String accType;
    private double balance;
    private double b_interest;


    BankAccount(int accNo, String accType){
        this.accNo=accNo;
        this.accType=accType;
        this.balance =0;
        this.b_interest=0;
    }

    public double getBinterest() {
        return b_interest;
    }

    public int getAccNo() {
        return accNo;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccType() {
        return accType;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setBinterest(double b_interest) {
        this.b_interest = b_interest;
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

