package Loops;
import java.util.Scanner;

public class SwitchStructure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the valid greeting sign: ");
        int button = sc.nextInt();

        switch(button) {
            case 1:
                System.out.println("Namaste!");
                break;
            case 2:
                System.out.println("Hello!");
                break;
            case 3:
                System.out.println("Bonjour!");
                break;
            default:
                System.out.println("Please enter the valid greeting sign!!!");
        }

        System.out.print("Enter a valid initial: ");
        char initial = sc.next().charAt(0);

        switch(initial) {
            case 'A':
                System.out.println("Aryan");
                break;
            case 'D':
                System.out.println("Dhara");
                break;
            case 'J':
                System.out.println("Jagruti");
                break;
            case 'K':
                System.out.println("Kaxxali");
                break;
            default:
                System.out.println("Enter a valid initial!!!");
        }
        
        sc.close();
    }
}