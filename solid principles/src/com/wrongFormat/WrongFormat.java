package com.wrongFormat;



public class WrongFormat {
    public static void main(String[] args) {
        Savings savings = new Savings(1,"Savings");
        Current current = new Current(2,"Current");
        FixedDepositSavings fixed = new FixedDepositSavings(3,"FixeddepositSavings");

        // BankAccount has two responsibilities deposit and withdraw
        // Single Responsibility Violation

        savings.deposit(2500.0);
        current.deposit(35000);
        fixed.deposit(200000);

        //interest method in bankAccount should be changed for every new account type added
        // Open-closed Principle Violation
        savings.interest();
        current.interest();

        //fixed  account should not have withdraw method
        // FixedDeposit_Savings cannot substitute Savings
        //Liskov Substitution principle violation
        // To fix this I used interface segregation
        fixed.withdraw(200);
        current.withdraw(1000);


        // Dependency Inversion Principle violation
        // Manager uses savings/current/fixed to accomplish its task i.e  finding total balance

        Manager manager = new Manager();
        manager.addBalance(savings);
        System.out.println(manager.getTotalBalance());
        manager.addBalance(current);
        System.out.println(manager.getTotalBalance());
        manager.addBalance(fixed);
        System.out.println(manager.getTotalBalance());
    }
}
