package Loops;
import java.util.Scanner;

public class SimpleIf {
    public static void main(String[] args) {
        //user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if(age <= 12 && age >= 0) {
            System.out.println("You are a child.");
        }
        else if (age > 12 && age <= 18) {
            System.out.println("You are a teenager.");
        }
        else if(age > 18 && age <= 60)
        {
            System.out.println("You are an adult.");
        }
        else if(age > 60) {
            System.out.println("You are a senior citizen.");
        }
        else {
            System.out.println("Enter a valid input!!!");
        }

        //closing the scanner object
        sc.close();
    }
}