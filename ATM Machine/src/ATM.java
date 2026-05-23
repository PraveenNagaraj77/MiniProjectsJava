import java.util.Scanner;

public class ATM {
    Scanner sc = new Scanner(System.in);

    BankAccount account = new BankAccount();
    TransactionHistory transactionHistory = new TransactionHistory();

    public void  start(){
        int choice;

        do {
            System.out.println("\n===== ATM MACHINE =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");

            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice){
                case 1:account.checkBalance();
                break;
                case 2:
                    System.out.println("Enter Deposit Amount: ");
                    double depositAmount = sc.nextDouble();

                    account.deposit(depositAmount);
                    transactionHistory.addTransaction("Deposited: "+depositAmount);


                    break;
                case 3:
                    System.out.println("Enter Withdraw Amount: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    transactionHistory.addTransaction("Withdrawn: "+withdrawAmount);
                    break;
                    case 4:
                        transactionHistory.showHistory();
                        break;
                case 5:
                    System.out.println("Thank you for using ATM");
                    break;
                default:
                    System.out.println("Invalid Choice");
            }

        }while (choice != 4);
        sc.close();
    }
}
