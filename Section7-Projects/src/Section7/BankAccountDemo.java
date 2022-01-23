package Section7;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount myAccount=new BankAccount("John Baugh",5000);
        BankAccount bobsAccount=new BankAccount("Bob Robinson");
        bobsAccount.deposit(500);
        System.out.println("owner : "+bobsAccount.getOwner());
        System.out.println("balance : "+bobsAccount.getBalance());

        bobsAccount.withDraw(1000);
        System.out.println("owner : "+bobsAccount.getOwner());
        System.out.println("balance : "+bobsAccount.getBalance());
        System.out.println();

        System.out.println("owner : "+myAccount.getOwner());
        System.out.println("balance : "+myAccount.getBalance());
        System.out.println();

        System.out.println("deposit 1000?");
        myAccount.deposit(1000);

        System.out.println("owner : "+myAccount.getOwner());
        System.out.println("balance : "+myAccount.getBalance());
        System.out.println();

    }
}
