package day10_if_statements;

// If using a class from a different package, we need to import that packege
import java.util.Scanner;

public class EvenOrOddWithSingleIfStatement {
    public static void main(String[] args) {
        // Created a Scanner Object
        // Scanner key                  - > Object Reference
        // new Scanner(System.in);      - > object
        Scanner key = new Scanner(System.in);

        System.out.print("Please, enter a number: ");
        int userNumber = key.nextInt(); // 3


        boolean isEven = userNumber % 2 == 0;
        boolean isOdd = userNumber % 2 != 0;

        if (isEven) {
            System.out.println(userNumber + " is even!");
        }

        if (isOdd) {
            System.out.println(userNumber + " is odd!");
        }



    }
}