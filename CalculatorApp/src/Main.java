
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        InputHandler input = new InputHandler();

        int choice ;

        do {
            System.out.println("\n===== CALCULATOR APP =====");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");

            choice = input.getChoice();

            if (choice>=1&&choice<=4) {
                double num1 = input.getNumber("Enter first number");
                double num2 = input.getNumber("Enter second number");

                double result = 0;

                switch (choice) {

                    case 1:
                        result = calculator.add(num1, num2);
                        System.out.println("Result = " + result);
                        break;

                    case 2:
                        result = calculator.subtract(num1, num2);
                        System.out.println("Result = " + result);
                        break;

                    case 3:
                        result = calculator.multiply(num1, num2);
                        System.out.println("Result = " + result);
                        break;
                    case 4:
                        result = calculator.divide(num1, num2);
                        System.out.println("Result = " + result);
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }

            } else if (choice==5) {
                System.out.println("Thanks for using Calculator");
            }else {
                System.out.println("Invalid Choice");
            }
        }while (choice!=5);
    }
}