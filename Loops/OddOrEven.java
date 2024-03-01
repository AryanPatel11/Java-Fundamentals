package Loops;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        //user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = sc.nextInt();

        int remainder = number % 2;

        if(remainder == 1) 
            System.out.println("The entered number is odd.");
        
        else
            System.out.println("The entered number is even.");

        sc.close();
    }
}
