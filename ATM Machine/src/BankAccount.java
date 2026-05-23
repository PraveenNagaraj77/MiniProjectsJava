public class BankAccount {
    double balance = 10000;

    //check balance
    public void checkBalance(){
        System.out.println("Current balance is: " + balance);

    }

    //Deposit Money
    public  void deposit(double amount){
        balance += amount;

        System.out.println("Amount deposited successfully: " + amount);
        System.out.println("Current balance is: " + balance);
    }

    //withdraw money

    public void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient funds!");
        }else {
            balance -= amount;

            System.out.println("Please Collect Your Cash");
            System.out.println("Current balance is: " + balance);
        }
    }


}
