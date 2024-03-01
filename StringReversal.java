//Reversing a string input using logic (without using libraries)
import java.util.Scanner;

public class StringReversal{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an input string: ");
        String input = sc.nextLine();

        System.out.println("Your reversed version of string is: " + reverse(input));
    }

    public static String reverse(String input){
        char[] characters = input.toCharArray();

        for(int i = 0; i < input.length()/2; i++){
            char hand;

            hand = characters[i];
            characters[i] = characters[input.length() - 1 - i];
            characters[input.length() - 1 - i] = hand;
        }
        return new String(characters);
    }
}