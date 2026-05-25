public class ResultService {

    public static  int calculateTotal(
            int tamil,
            int english,
            int maths,
            int science,
            int social
    ){
        return tamil+english+maths+science+social;
    }

    public static double calculateAverage(int total){
        return total/5.0;
    }


    public static char calculateGrade(double average){
        if (average >=90){
            return 'A';
        } else if (average>=75) {
            return 'B';
        }else if (average >=50){
            return 'C';
        }else if (average >=40){
            return 'D';
        }else {
            return 'F';
        }
    }


    public static String getResultStatus(
            int tamil,
            int english,
            int maths,
            int science,
            int social
    ){
        if (tamil>=35 && english>=35 && maths>=35 && science>=35){
            return "PASS";
        }else{
            return "FAIL";
        }
    }

}
