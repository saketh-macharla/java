package com.correctFormat;

public class CorrectFormat {
    public static void main(String[] args) {
        Savings savings = new Savings(1,"Savings");
        WithdrawableSavings withdrawableSavings = new WithdrawableSavings(4,"Withdrawable_Savings");
        Current current = new Current(2,"Current");
        FixedDepositSavings fixed = new FixedDepositSavings(3,"FixeddepositSavings");


        savings.deposit(2500.0);
        current.deposit(5000.0);
        fixed.deposit(200000);
        withdrawableSavings.deposit(5000);


        savings.interest();
        current.interest();
        fixed.interest();

        //savings.withdraw();
        withdrawableSavings.withdraw(1000);
        current.withdraw(200);
        //fixed.withdraw(200);

        Manager manager = new Manager();
        manager.addBalance(savings);
        System.out.println(manager.getTotalBalance());
        manager.addBalance(current);
        System.out.println(manager.getTotalBalance());
        manager.addBalance(fixed);
        System.out.println(manager.getTotalBalance());
        manager.addBalance(withdrawableSavings);
        System.out.println(manager.getTotalBalance());
    }
}
