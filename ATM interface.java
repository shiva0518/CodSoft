import java.util.Scanner;
class ATM
{
    private Account account;
    String res;
    ATM(Account account)
    {
        this.account=account;
    }
    public String withdraw(double amount)
    {
        res="";
        if(amount>account.getbalance())
        {
            res=res+"Cannot withdraw amount due to insufficient balance";
        }
        else{
            account.setBalance(account.getbalance()-amount);
            res=res+"Amount withdraw is successful";
        }
        return res;
    }
    public String deposit(double amount)
    {
        res="";
        account.setBalance(account.getbalance()+amount);
        res="Deposit of "+amount+" is successful \nCurrent balance is "+account.getbalance();
        return res;
    }
    public String checkbalance()
    {
        res="Current balance :"+account.getbalance();
        return res;
    }
}
class Account
{
    private double balance;
    public Account(double inibalance)
    {
        this.balance=inibalance;
    }
    public double getbalance()
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
}
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Account acc=new Account(2500.00);
        ATM atm=new ATM(acc);
        while (true) {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println(atm.checkbalance());
                    break;
                case 2:
                    System.out.println("Enter amount to deposit:");
                    double d=sc.nextDouble();
                    System.out.println(atm.deposit(d));
                    break;
                case 3:
                    System.out.println("Enter amount to withdraw: ");
                    double w = sc.nextDouble();
                    System.out.println(atm.withdraw(w));
                    break;
                case 4:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
