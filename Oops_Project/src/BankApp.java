
class Account{

   private String accountHolderName;
   private double amount;

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getAmount() {
        return amount;
    }

    public void deposit(double pay) {
        if (pay > 0) {
            amount = amount + pay;
            System.out.println("deposit Amount - " + pay + " Total Balance - " + getAmount());

        } else{
            System.out.println("Invalid Amount Deposit");
        }
    }

    public void withdraw(double withdraw){

        if (withdraw > 0) {
            amount = amount - withdraw;
            System.out.println("Withdraw Amount - " + withdraw + " Total Balance - " + getAmount());

        } else{
            System.out.println("Invalid Amount  Withdraw");
        }

    }
}



public class BankApp {
    public static void main(String[] args) {

        Account account = new Account();
          account.setAccountHolderName("Piyush");

          account.deposit(1250);
          account.withdraw(400);
    }
}
