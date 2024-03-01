package Basics;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //Creating a scanner object
        Scanner sc = new Scanner(System.in);

        //Declaring variable or storage container
        int number;
        double decimal;
        float largeDecimal;
        char letter;
        String sentence;

        //Input statements
        //The declaring of the variable and initiating to store an input can be done in a single line
        System.out.print("Enter your number: ");
        //int number = sc.nextInt();
        number = sc.nextInt();

        System.out.print("Enter your decimal: ");
        decimal = sc.nextDouble();

        System.out.print("Enter your largeDecimal: ");
        largeDecimal = sc.nextFloat();

        System.out.print("Enter your letter: ");
        letter = sc.next().charAt(0);
        sc.nextLine();

        System.out.print("Enter your sentence: ");
        sentence = sc.nextLine();
        System.out.println();

        //Output statements in order to check the input accuracy
        System.out.println("Your number is : " + number);
        System.out.println("Your decimal is : " + decimal);
        System.out.println("Your largeDecimal is : " + largeDecimal);
        System.out.println("Your letter is : " + letter);
        System.out.println("Your sentence is : " + sentence);

        sc.close();
    }
}