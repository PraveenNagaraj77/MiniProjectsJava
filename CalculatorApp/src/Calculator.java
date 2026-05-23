public class Calculator {
    //Addition
    public double add(double a, double b) {
        return a + b;
    }
    //Subtraction
    public double subtract(double a, double b) {
        return a - b;
    }

    //multiply
    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if(b==0){
            System.out.println("Cannot divide by zero");
            return 0;
        }
        return a / b;
    }
}
