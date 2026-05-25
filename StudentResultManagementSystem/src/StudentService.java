import java.sql.SQLOutput;

public class StudentService {
    public static void displayMarksheet(
            String name,
            int tamil,
            int english,
            int maths,
            int science,
            int social,
            int total,
            double average,
            char grade,
            String resultStatus
    ){

        System.out.println("\n===== STUDENT MARKSHEET =====");

        System.out.println("Student Name : " + name);

        System.out.println("Tamil   : " + tamil);
        System.out.println("English : " + english);
        System.out.println("Maths   : " + maths);
        System.out.println("Science : " + science);
        System.out.println("Social : " + social);

        System.out.println("Total   : " + total);
        System.out.println("Average : " + average);
        System.out.println("Result  : " + resultStatus);
        System.out.println("Grade   : " + grade);

        System.out.println("=============================");
    }
}
