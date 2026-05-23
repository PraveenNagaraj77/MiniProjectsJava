import java.util.Scanner;

public class InputHandler {
    Scanner sc = new Scanner(System.in);

    //Read Number
    public double getNumber(String message){
        System.out.println(message);
        return sc.nextDouble();
    }

    //Read Choice
    public int getChoice(){
        System.out.println("Enter your choice");
        return sc.nextInt();
    }
}
