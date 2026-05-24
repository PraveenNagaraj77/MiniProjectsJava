public class PayrollHelper {
    //Display Menu
    public static void showMenu(){
        System.out.println("====================");
        System.out.println("Employee Payroll System");
        System.out.println("====================");
    }

    //Display Payslip
    public static void displayPaySlip(
            String employeeName,
            int employeeId,
            double basicSalary,
            double bonus,
            double tax,
            double netSalary
    ){
        System.out.println("\n========== PAYSLIP ==========");

        System.out.println("Employee Name : " + employeeName);
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Basic Salary  : " + basicSalary);
        System.out.println("Bonus Amount  : " + bonus);
        System.out.println("Tax Amount    : " + tax);
        System.out.println("Net Salary    : " + netSalary);

        System.out.println("==============================");
    }
}
