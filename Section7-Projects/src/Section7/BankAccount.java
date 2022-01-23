package Section7;

public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner)
    {
        this(owner,0);
    }
    public BankAccount(String owner,int balance)
    {
        this.owner=owner;
        this.balance=balance;
    }
    public void deposit(int amount)
    {
        if(amount>0)
        {
            balance+=amount;
        }
        else
        {
            System.out.println("amount to deposit must be greater than 0");
        }
    }
    public void withDraw(int amount)
    {
        if(amount>0 && amount<=balance)
        {
            balance-=amount;
        }
        else
        {
            System.out.println("amount to withdraw must be greater than 0 and less than balance");
        }
    }
    public String getOwner()
    {
        return owner;
    }
    public int getBalance()
    {
        return balance;
    }
}
