
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        double firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        double secondNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        double thirdNum = Integer.valueOf(scanner.nextLine());
        System.out.println("The average is " + ((firstNum + secondNum + thirdNum)/3));

    }
}
