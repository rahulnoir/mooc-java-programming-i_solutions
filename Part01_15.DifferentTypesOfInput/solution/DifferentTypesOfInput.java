
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String userInputString = scan.nextLine();
        System.out.println("Give an integer:");
        int userInputInt = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double userinputDouble = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean userInputBool = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + userInputString);
        System.out.println("You gave the integer " + userInputInt);
        System.out.println("You gave the double " + userinputDouble);
        System.out.println("You gave the boolean " + userInputBool);
    }
}
