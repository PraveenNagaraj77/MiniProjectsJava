import java.util.Scanner;

public class EmployeePayrollSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PayrollHelper.showMenu();

        System.out.println("Enter Employee Name");
        String employeeName = sc.nextLine();

        System.out.println("Enter Employee Id");
        int employeeId = sc.nextInt();

        System.out.print("Enter Basic Salary : ");
        double basicSalary = sc.nextDouble();

        System.out.print("Enter Bonus Percentage : ");
        double bonusPercentage = sc.nextDouble();

        System.out.print("Enter Tax Percentage : ");
        double taxPercentage = sc.nextDouble();

        //Method Calling
        double bonus = PayrollOperations.calculateBonus(basicSalary,bonusPercentage);
        double tax = PayrollOperations.calculateTax(basicSalary,taxPercentage);
        double netSalary = PayrollOperations.calculateSalary(basicSalary,bonus,tax);

        //Display Payslip

        PayrollHelper.displayPaySlip(
                employeeName,
                employeeId,basicSalary,
                bonus,
                tax,
                netSalary
        );


        sc.close();



    }
}
