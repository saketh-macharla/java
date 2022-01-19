package com.wrongFormat;

public abstract class BankAccount {
    public int accNo;
    public String accType;
    public double Balance;
    public double b_interest;


    BankAccount(int accNo, String accType){
        this.accNo=accNo;
        this.accType=accType;
        this.Balance=0;
    }

    // Everytime a accType is added then interest method should be changed
    // This violates OpenClosed Principle

    void interest(){
        if(accType.equals("Savings")){
            b_interest=2.0;
        }
        else if(accType.equals("Current")) {
            b_interest = 4.0;
        }

    }
    // deposit and withdraw are two responsibilities
    // This violates Single Responsibility Principle


    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

}
