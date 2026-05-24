public class PayrollOperations {

    //calcualte bonus
    public static double calculateBonus(double basicSalary,double bonusPercentage){
        return (basicSalary*bonusPercentage)/100;
    }


    //calculate tax
    public static double calculateTax(double basicSalary,double taxPercentage){
        return (basicSalary*taxPercentage)/100;
    }

    public static double calculateSalary(double basicSalary,double bonus , double tax){
        return basicSalary+bonus-tax;
    }



}
