public class AtmAccount {
    private final int accountNumber;
    private String pin;
    private double balance;
    private double dailyLimit;
    private double withdrawnToday;


    public AtmAccount(int accountNumber, String pin, double balance, double dailyLimit, double withdrawnToday) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
        this.dailyLimit = dailyLimit;
        this.withdrawnToday = withdrawnToday;
    }

   public boolean validatePin(String inputPin){
       if (pin.equals(inputPin)) {
           return true;
       }else {
           return false;
    }

    }
    public boolean withdraw(double amount, String pinInput){
        if (!validatePin(pinInput)){
            System.out.println("Invalid Pin");
        }
        return false;
    }


}
