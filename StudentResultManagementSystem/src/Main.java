import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Tamil Mark: ");
        int tamil = sc.nextInt();

        System.out.print("Enter English Mark: ");
        int english = sc.nextInt();

        System.out.print("Enter Maths Mark: ");
        int maths = sc.nextInt();

        System.out.print("Enter Science Mark: ");
        int science = sc.nextInt();

        System.out.print("Enter Social Mark: ");
        int social = sc.nextInt();


        int total = ResultService.calculateTotal(tamil, english, maths, science, social);
        double average = ResultService.calculateAverage(total);
        char grade = ResultService.calculateGrade(average);

        String resultStatus = ResultService.getResultStatus(
                tamil, english, maths, science, social
        );

        StudentService.displayMarksheet(
                name,
                tamil,
                english,
                maths,
                science,
                social,
                total,
                average,
                grade,
                resultStatus

        );

        sc.close();



    }
}