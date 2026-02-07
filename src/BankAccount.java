public class BankAccount {
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    public BankAccount(String accountNumber,double balance,String accountHolderName){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountHolderName = accountHolderName;


    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double deposit(double amount){
         return amount + balance;
    }

    public double withdrawal(double amount){
        if (amount > balance){
            System.out.println("Insufficient Balance");
        }
        return balance - amount;

    }
}
