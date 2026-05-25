import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        int quantity;
        double totalBill= 0;
        char continueOrder;

        do{
            MenuService.showMenu();
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if(choice==5){
                System.out.println("Thank you for using our service");
                break;
            }


            System.out.println("Enter your quantity: ");
            quantity = sc.nextInt();

            double itemTotal = BillingService.calculateItemTotal(choice, quantity);

            totalBill = totalBill + itemTotal;

            System.out.println("Item Added Successfully");
            System.out.println("Your total bill is: " + totalBill);


            System.out.println("Do you want to continue? y/n");
            continueOrder = sc.next().charAt(0);




        }while (continueOrder=='y' || continueOrder=='Y');
        BillingService.printFinalBill(totalBill);

        sc.close();
    }
}